package shapes;

/**
 * 
 * @author Tulin
 */

public class Pyramid extends Shape
{
	private double length;

	/**
	 * 
	 */
	public Pyramid(double height, double length) 
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
		return calcBaseArea() * height / 3;
	}

	@Override
	public String toString() {
		return "Pyramid [getLength()=" + getLength() + ", calcBaseArea()=" + calcBaseArea() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}

}
