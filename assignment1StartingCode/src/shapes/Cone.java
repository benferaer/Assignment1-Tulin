package shapes;
/**
 * Subclass of Shape representing a Cone with a radius
 * @author Tulin
 */
public class Cone extends Shape
{
	private double radius;

	public Cone(double height, double radius) 
	{
		super(height);
		this.radius = radius;
	}

	public double getRadius() 
	{
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
		return calcBaseArea() * height / 3;
	}

	@Override
	public String toString() {
		return "Cone [getRadius()=" + getRadius() + ", calcBaseArea()=" + calcBaseArea() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}	
	
}
