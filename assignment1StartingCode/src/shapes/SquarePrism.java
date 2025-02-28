package shapes;

/**
 * Subclass of Prism representing a Square Prism with a height and side
 * @author Tulin
 */

public class SquarePrism extends Prism
{
	/**
	 *  creates a square prism with specified height and side length
	 */
	public SquarePrism(double height, double side) 
	{
		super(height, side);
	}

	/**
     * Calculates the base area of the square prism
     * @return The base area of the square prism
     */
	
	@Override
	public double calcBaseArea() 
	{
		return getSide() * getSide();
	}


	@Override
	public String toString() {
		return "SquarePrism [calcBaseArea()=" + calcBaseArea() + ", getSide()=" + getSide() + ", calcVolume()="
				+ calcVolume() + ", getHeight()=" + getHeight() + "]";
	}

	

}
