package utilities;
import shapes.Shape;

/**
 * Utility class for the Insertion Sort algorithm.
 * @author Laila Escoto
 */

public class InsertionSort 
{
	/**
     * Compares two Shape objects based on the selected type
     *
     * @param s1          1st shape
     * @param s2          2nd shape
     * @param compareType 'v' for volume, 'a' for base area, 'h' for height
     * @return positive number if s1 > s2, zero if equal, and a negative number if s1 < s2
     */
    private static int compare(Shape s1, Shape s2, char compareType) 
    {
        switch (compareType) 
        {
            case 'v':
                return s1.compareVolume(s2);
            case 'a':
                return s1.compareBaseArea(s2);
            case 'h':
                return s1.compareTo(s2);
            default:
                throw new IllegalArgumentException("Invalid comparison type");
        }
    }
	
	
    /**
     * Sorts an array of Shape objects using the Insertion algorithm
     *
     * @param shapes      The array of shapes to be sorted
     * @param compareType 'v' for volume, 'a' for base area, 'h' for height
     */
    public static void insertionSort(Shape[] shapes, char compareType) 
    {
        int n = shapes.length;
        for (int i = 1; i < n; i++) 
        {
            Shape key = shapes[i];
            int j = i - 1;
            
            // Compare based on selected type and move elements that are smaller than key one position ahead (for descending order)
            while (j >= 0 && compare(shapes[j], key, compareType) > 0) 
            {
                shapes[j + 1] = shapes[j];
                j--;
            }
            shapes[j + 1] = key;
        }
    }


}
