package shapes;

/**
 * 
 * @author Tulin
 */

public class PentagonalPrism extends Shape
{
	private double length;

	/**
	 * 
	 */
	public PentagonalPrism(double height, double length) 
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
		return ((5 * (length * length)) * Math.tan(0.942478)) / 4;
	}

	@Override
	public double calcVolume() 
	{
		return calcBaseArea() * height;
	}

	@Override
	public String toString() 
	{
		return "PentagonalPrism [length=" + length + ", getLength()=" + getLength() + ", calcBaseArea()="
				+ calcBaseArea() + ", calcVolume()=" + calcVolume() + ", getHeight()=" + getHeight() + "]";
	}
	
	
}
