package shapes;

/**
 * Subclass of Shape representing a Cylinder with a radius
 * @author Tulin
 */

public class Cylinder extends Shape
{
	private double radius;
	
	/**
	 * 
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	/**
	 * 
	 * @return
	 */
	public double getRadius() {
		return radius;
	}

	@Override
	public double calcBaseArea() 
	{
		return Math.PI * radius * radius;
	}

	@Override
	public double calcVolume() 
	{
		return calcBaseArea() * height;
	}

	@Override
	public String toString() {
		return "Cylinder [getRadius()=" + getRadius() + ", calcBaseArea()=" + calcBaseArea() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}
	
}
