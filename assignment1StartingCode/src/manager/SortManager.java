package manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import utilities.QuickSortUtil;
import utilities.BubbleSort;  

//refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)
public class SortManager 
{
	private Shape[] shapes;
	private String fileName;
	private char compareType;
	private char sortType;
	
	public SortManager(String[] args)
	{
		for(String s : args)
		{
			System.out.println(s);
			if(s.startsWith("-f") || s.startsWith("-F"))
			{
				fileName = s.substring(2);
			}
			else if (s.startsWith("-t") || s.startsWith("-T"))
			{
				compareType = s.substring(2).charAt(0);
			}
			else if (s.startsWith("-s") || s.startsWith("-S"))
			{
				sortType = s.substring(2).charAt(0);
			}
		}
		
		//Loads shapes from file
		loadShapes();
		sortShapes();
		
		long startTime = System.nanoTime();
		//Applies the identified sort method from args
		switch (sortType)
		{
		case 'q':
			QuickSortUtil.quicksort(shapes, 0, shapes.length - 1, compareType);
			break;
		}
		
		long endTime = System.nanoTime();
		//placeholder to print shapes for testing loadShapes
		printShapes();
        // Calculate the elapsed time in milliseconds
        long elapsedTime = (endTime - startTime) / 1000000; // Convert to milliseconds
        
        System.out.println("Time taken to sort shapes: " + elapsedTime + " milliseconds");
	}
	
	/**
	 * Method for loading the Shapes array from the file name define in args
	 */
	private void loadShapes()
    {
	File file = new File("res/"+fileName);
	try
	{
	    Scanner input = new Scanner(file);
	    //Taking the first line as the array length 
	    int arrLength = Integer.parseInt(input.nextLine().trim());
	    
	    //Define the size of the array
	    shapes = new Shape[arrLength];
	    int index = 0;
	    
	    for(int i = 0; i < arrLength; i++)
	    {
	    	if(input.hasNextLine()) 
	    	{
	    		String line = input.nextLine();
	    		String[] parts = line.split("\\s+");
	    		
	    		switch (parts[0].toLowerCase())
	    		{
	    		case "cone":
	    			double height = Double.parseDouble(parts[1]);
	    			double radius = Double.parseDouble(parts[2]);
	    			
	    			shapes[index++] = new Cone(height, radius);
	    			break;
	    		case "cylinder":
	    			double cylHeight = Double.parseDouble(parts[1]);
	    			double cylRadius = Double.parseDouble(parts[2]);
	    			
	    			shapes[index++] = new Cylinder(cylHeight, cylRadius);
	    			break;
	    		case "octagonalprism":
	    			double opHeight = Double.parseDouble(parts[1]);
	    			double opLength = Double.parseDouble(parts[2]);
	    			
	    			shapes[index++] = new OctagonalPrism(opHeight, opLength);
	    			break;
	    		case "pentagonalprism":
	    			double ppHeight = Double.parseDouble(parts[1]);
	    			double ppLength = Double.parseDouble(parts[2]);
	    			
	    			shapes[index++] = new PentagonalPrism(ppHeight, ppLength);
	    			break;
	    		case "pyramid":
	    			double pHeight = Double.parseDouble(parts[1]);
	    			double pLength = Double.parseDouble(parts[2]);
	    			
	    			shapes[index++] = new Pyramid(pHeight, pLength);
	    			break;
	    		case "squareprism":
	    			double spHeight = Double.parseDouble(parts[1]);
	    			double spLength = Double.parseDouble(parts[2]);
	    			
	    			shapes[index++] = new SquarePrism(spHeight, spLength);
	    			break;
	    		case "triangularprism":
	    			double tpHeight = Double.parseDouble(parts[1]);
	    			double tpLength = Double.parseDouble(parts[2]);
	    			
	    			shapes[index++] = new TriangularPrism(tpHeight, tpLength);
	    			break;
	    		}
	    	}
	    }
	}
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
  }

  private void sortShapes()
	{
		if(compareType == 'h' || compareType == 'H')
		{
			if(sortType == 'b' || sortType == 'B')
				{
					BubbleSort.sort(shapes);
				}
    }
	
	//Method for displaying the sorted array of shapes
	private void printShapes() 
	{
		// If checks that the shape array has objects
	    if (shapes.length > 0) 
	    {
	        System.out.println("First value: " + shapes[0]); //prints the first value
	    }

	    // Loop through the array and print every thousandth shape starting from the 1000th element (index 999)
	    for (int i = 999; i < shapes.length - 1; i++) // shapes.length - 1 ensures that the last element is not printed in the thousandth's format
	    {
	        if ((i + 1) % 1000 == 0) // Print the 1000th element, 2000th element, and so on
	        {  
	            System.out.println((i + 1) + "-th element: " + shapes[i]);
	        }
	    }

	    // Print the last shape
	    if (shapes.length > 0) 
	    {
	        System.out.println("Last value: " + shapes[shapes.length - 1]); //prints the last value
	    }
	}
}
