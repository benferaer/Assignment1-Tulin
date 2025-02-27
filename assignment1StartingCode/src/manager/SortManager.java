package manager;

import shapes.Shape;

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
			else if (s.startsWith("-t") || s.startsWith("-T"))
			{
				compareType = s.charAt(2);
			}
			else if (s.startsWith("-s") || s.startsWith("-S"))
			{
				sortType = s.charAt(2);
			}
		}
		
		loadShapes();
		
	}
	
	private void loadShapes()
	{
		//from fileName, load shapes
		//first line is the length of the array
	}
}
