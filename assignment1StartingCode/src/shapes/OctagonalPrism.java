package shapes;

public class OctagonalPrism extends Shape
{	
	private double length;

	public OctagonalPrism(double height, double length) 
	{
		super(height);
		this.length = length;
	}

	public double getLength() 
	{
		return length;
	}

	@Override
	public double calcBaseArea() 
	{
		return 2 * (1 + Math.sqrt(2)) * (length * length);
	}

	@Override
	public double calcVolume() 
	{
		return calcBaseArea() * height;
	}

	@Override
	public String toString() 
	{
		return "OctagonalPrism [getLength()=" + getLength() + ", calcBaseArea()=" + calcBaseArea() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}
	
	
	
	
}
