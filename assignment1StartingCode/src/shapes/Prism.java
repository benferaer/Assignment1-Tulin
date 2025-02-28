package shapes;

/**
 * Superclass of prisms, subclass of shape
 * @author Tulin
 */

public abstract class Prism extends Shape 
{
	 /** The length of a side of the prism's base. */
	private double side;

	
	 /**
	 * creates prism with height from shape and added param of side
     * @param height The height of the prism
     * @param side   The length of a side of the prism's base
     */
	public Prism(double height, double side) 
	{
		super(height);
		this.side = side;
	}

	/**
	 * Returns the Side measurement of the Prism shape
     * @return The side length of the prism.
     */
	public double getSide() 
	{
		return side;
	}
	
	/**
     * Calculates the volume of the prism.
     * Volume = multiplying the base area by the height.
     * @return The volume of the prism.
     */

	@Override
	public double calcVolume() 
	{
		return calcBaseArea() * getHeight();
	}
	
	
}
