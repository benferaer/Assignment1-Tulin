package utilities;
import java.util.Arrays;
import java.util.Comparator;
import shapes.Shape;

/**
 * Class which defines the Merge Sort method
 * @author Ethan Go
 */

public class MergeSort
	{
		public static void sort(Shape[] shapes, char compareType)
		{
			mergeSort(shapes, 0, shapes.length - 1, compareType);
		}
		
		
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
