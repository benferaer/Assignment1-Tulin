package shapes;

public class TriangularPrism extends Shape
{
	private double length;

	public TriangularPrism(double height, double length) 
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
		return (length * length) * Math.sqrt(3) / 4;
	}

	@Override
	public double calcVolume() 
	{
		return calcBaseArea() * height;
	}

	@Override
	public String toString() 
	{
		return "TriangularPrism [getLength()=" + getLength() + ", calcBaseArea()=" + calcBaseArea() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}
	

}
