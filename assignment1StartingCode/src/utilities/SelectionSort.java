package utilities;
import shapes.Shape;

/**
 * Utility class for the Selection Sort algorithm.
 * @author Ruskin Tanoy
 */
public class SelectionSort 
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
     * Sorts an array of Shape objects using the Selection Sort algorithm in descending order.
     *
     * @param shapes      The array of shapes to be sorted
     * @param compareType 'v' for volume, 'a' for base area, 'h' for height
     */
    public static void selectionSort(Shape[] shapes, char compareType) 
    {
        int n = shapes.length;

        for (int i = 0; i < n - 1; i++) 
        {
            int maxIndex = i; // Assume max is at index i

            for (int j = i + 1; j < n; j++) 
            {
                // Find the maximum element for descending order
                if (compare(shapes[j], shapes[maxIndex], compareType) > 0) 
                {
                    maxIndex = j;
                }
            }

            // Swap the found max element with the first element
            if (maxIndex != i) 
            {
                Shape temp = shapes[i];
                shapes[i] = shapes[maxIndex];
                shapes[maxIndex] = temp;
            }
        }
    }
}
