package shapes;

/**
 * 
 * @author Tulin
 */

public class SquarePrism extends Shape
{
	private double length;

	/**
	 * 
	 */
	public SquarePrism(double height, double length) 
	{
		super(height);
		this.length = length;
	}

	/**
	 * 
	 * @return
	 */
	public double getLength() 
	{
		return length;
	}

	@Override
	public double calcBaseArea() 
	{
		return length * length;
	}

	@Override
	public double calcVolume() 
	{
		return calcBaseArea() * height;
	}

	@Override
	public String toString() 
	{
		return "SquarePrism [getLength()=" + getLength() + ", calcBaseArea()=" + calcBaseArea() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}
	

}
