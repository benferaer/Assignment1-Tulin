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
		for(String s: args)
		{
			System.out.println(s);
			if(s.startsWith("-f") || s.startsWith("-F"))
			{
				fileName = s.substring(2);
			}
//			else if (s.startsWith("-t") || s.startsWith("-T"))
//			{
//				compareType = s.charAt(2);
//			}
//			else if (s.startsWith("-s") || s.startsWith("-S"))
//			{
//				sortType = s.charAt(2);
//			}
		}
		
		loadShapes();
		//placeholder to print shapes for testing loadShapes
		printShapes();
		
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
	
	//placeholder method for printing shapes for checking
	private void printShapes() {
		for (Shape shape : shapes)
		{
			System.out.println(shape);
		}
	}
}
