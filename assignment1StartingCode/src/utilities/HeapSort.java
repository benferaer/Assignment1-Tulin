package utilities;
import shapes.Shape;

/**
 *
 */

public class HeapSort {

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
     * Heapifies a subtree with root at index i in an array of size n. Initial heap sort algorithm was taken from Geeksforgeeks
     *
     * @param shapes      The array of shapes
     * @param n           The size of the heap
     * @param i           The root index of the subtree
     * @param compareType The comparison type ('v', 'a', 'h')
     */
	
	private static void heapify(Shape[] shapes, int n, int i, char compareType) 
    {
        int smallest = i;  // Initialize smallest as root to comply with descending order requirement
        int left = 2 * i + 1;  // Left child
        int right = 2 * i + 2; // Right child

     // If left child is larger than root
        if (left < n && compare(shapes[left], shapes[smallest], compareType) < 0) 
        {
            smallest = left;
        }

        // If right child is larger than largest so far
        if (right < n && compare(shapes[right], shapes[smallest], compareType) < 0) 
        {
            smallest = right;
        }

        // If largest is not root
        if (smallest != i) 
        {
            Shape temp = shapes[i];
            shapes[i] = shapes[smallest];
            shapes[smallest] = temp;

            // Recursively heapify the affected subtree
            heapify(shapes, n, smallest, compareType);
        }
        
    }
	
	/**
     * @param shapes      The array of shapes to be sorted
     * @param compareType 'v' for volume, 'a' for base area, 'h' for height
     */
	
	public static void heapSort(Shape[] shapes, char compareType) 
    {
        int n = shapes.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            heapify(shapes, n, i, compareType);
        }

        // Extract elements from the heap
        for (int i = n - 1; i > 0; i--) 
        {
            // Swap the root (largest) with the last element
            Shape temp = shapes[0];
            shapes[0] = shapes[i];
            shapes[i] = temp;

            // Heapify the reduced heap
            heapify(shapes, i, 0, compareType);
        }
    }
}

