package shapes;

/**
 * Subclass of Prism representing an Octagonal Prism with a height and base side length
 * @author Tulin
 */

public class OctagonalPrism extends Prism
{	

	/**
	 * Creates an octagonal prism with the specified height and base side length
	 */
	public OctagonalPrism(double height, double side) 
	{
		super(height, side);
	}

	/**
     * Calculates the base area of the octagonal prism
     * @return The base area of the octagonal prism
     */
	@Override
	public double calcBaseArea() 
	{
		return 2 * (1 + Math.sqrt(2)) * (getSide() * getSide());
	}

	@Override
	public String toString() {
		return "OctagonalPrism [calcBaseArea()=" + calcBaseArea() + ", getSide()=" + getSide() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}
	
	
	
}
