package shapes;
/**
 * Superclass of all shapes
 * @author Tulin
 */
public abstract class Shape implements Comparable<Shape> 
{
	public double height;
	
	/**
	 * Creates a Shape with a defined height
	 * @param height
	 */
	public Shape(double height) 
	{
		super();
		this.height = height;
	}

	/**
	 * Allows the retrieval of an instantiated Shape's height
	 * @return height
	 */
	public double getHeight() 
	{
		return height;
	}

	@Override
	public int compareTo(Shape other) 
	{
		if(this.height > other.height)
		{
			return 1;
		}
		if(this.height < other.height)
		{
			return -1;
		}
		return 0;
	}
	
	/**
	 * Retrieval of the base area of the shape
	 * @return base area
	 */
	public abstract double calcBaseArea();
	
	/**
	 * Retrieval of the volume of the shape
	 * @return volume
	 */
	public abstract double calcVolume();

	
	
	
}
