package utilities;
import java.util.Arrays;
import shapes.Shape;

/**
 * Class which defines the Merge Sort method
 * @author Ethan Go
 */

public class MergeSort
	{
		/**
		 * Sorts array of shapes using Merge Sort algorithm (descending)
		 * @param shapes	Array of shapes for sorting
		 * @param compareType	Comparison type( h height, v volume, a base area)
		 */
		public static void sort(Shape[] shapes, char compareType)
		{
			mergeSort(shapes, 0, shapes.length - 1, compareType);
		}
		
		
		/**
		 * Method that splits the array recursively until single values, then calls merge method to
		 *  merge each subarray in order until combined back into a single array.
		 * This method calls itself until array is sorted
		 * @param shapes	Array of shapes for sorting
		 * @param left		Left index of array segment
		 * @param right		Right index of array segment
		 * @param compareType	Comparison type( h height, v volume, a base area)
		 */
		private static void mergeSort(Shape[] shapes, int left, int right, char compareType)
		{
			if (left < right)
			{
				int mid = left + (right - left) / 2;
				mergeSort(shapes, left, mid, compareType);
				mergeSort(shapes, mid + 1, right, compareType);
				merge(shapes, left, mid, right, compareType);
			}
		}
		
		/**
		 * Merges two sorted subarrays into one array sorted in descending order
		 * 
		 * @param shapes Array containing subarrays that will be merged
		 * @param left	Left index of first subarray
		 * @param mid	Mid index dividing two subarrays
		 * @param right	Right index of second subarray
		 * @param compareType Comparison type( h height, v volume, a base area)
		 */
		private static void merge(Shape[] shapes, int left, int mid, int right, char compareType)
		{
			int n1 = mid - left + 1;
			int n2 = right - mid;
			Shape[] leftArray = Arrays.copyOfRange(shapes, left, mid + 1);
			Shape[] rightArray = Arrays.copyOfRange(shapes, mid + 1, right + 1);
			int i = 0, j = 0, k = left;
			while (i < n1 && j < n2)
			{
				if (compare(leftArray[i], rightArray[j], compareType) > 0)
				{
					shapes[k++] = leftArray[i++];
				}
				else
				{
					shapes[k++] = rightArray[j++];
				}
			}
			while (i < n1)
			{
				shapes[k++] = leftArray[i++];
			}
			while (j < n2)
			{
				shapes[k++] = rightArray[j++];
			}
		}
		
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
	}
