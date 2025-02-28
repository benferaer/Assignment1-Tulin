package shapes;

/**
 * Subclass of Prism representing a Pentagonal Prism with a height and side length
 * @author Tulin
 */

public class PentagonalPrism extends Prism
{

	/**
	 * Creates a pentagonal prism with the specified height and base side length
     * 
	 */
	public PentagonalPrism(double height, double side) 
	{
		super(height, side);
	}

	/**
	 * Calculates the base area of the pentagonal prism
	 * @return The base area of the pentagonal prism
	 */

	@Override
	public double calcBaseArea() 
	{
		return ((5 * (getSide() * getSide())) * Math.tan(0.942478)) / 4;
	}

	@Override
	public String toString() {
		return "PentagonalPrism [calcBaseArea()=" + calcBaseArea() + ", getSide()=" + getSide() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}

	
	
}
