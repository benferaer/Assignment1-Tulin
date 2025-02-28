package utilities;
import shapes.Shape;

/**
 * Utility class for the Bubble Sort algorithm.
 * @author Ruskin Tanoy
 */
public class BubbleSort 
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
     * Sorts an array of Shape objects using the Bubble Sort algorithm in descending order.
     *
     * @param shapes      The array of shapes to be sorted
     * @param compareType 'v' for volume, 'a' for base area, 'h' for height
     */
    public static void bubbleSort(Shape[] shapes, char compareType) 
    {
        int n = shapes.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
            {
                // Swap if the current shape is smaller than the next one (for descending order)
                if (compare(shapes[j], shapes[j + 1], compareType) < 0) 
                {
                    Shape temp = shapes[j];
                    shapes[j] = shapes[j + 1];
                    shapes[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps were made, the array is already sorted
            if (!swapped) 
                break;
        }
    }
}
