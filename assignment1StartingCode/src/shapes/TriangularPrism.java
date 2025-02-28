package shapes;

/**
 * Subclass of Prism representing a Triangular Prism with a height and side length
 * @author Tulin
 */

public class TriangularPrism extends Prism
{
	/**
	 * Creates a triangular prism with the specified height and base side length
	 */
	public TriangularPrism(double height, double side) 
	{
		super(height, side);
	}

	/**
	 * Calculates the base area of the triangular prism
	 * @return base area of the triangular prism
	 */

	@Override
	public double calcBaseArea() 
	{
		return (getSide() * getSide()) * Math.sqrt(3) / 4;
	}

	@Override
	public String toString() {
		return "TriangularPrism [calcBaseArea()=" + calcBaseArea() + ", getSide()=" + getSide() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}

	

}
