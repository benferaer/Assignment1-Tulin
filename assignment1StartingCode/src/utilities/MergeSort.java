package utilities;
import java.util.Comparator;
import shapes.Shape;

/**
 * Class which defines the Merge Sort method
 * @author Ethan Go
 */

public class MergeSort
	{
		public static void sort(Shape[] shapes, Comparator<Shape> comparator)
		{
			mergeSort(shapes, 0, shapes.length - 1, comparator);
		}
		
		
		private static void mergeSort(Shape[] shapes, int left, int right, Comparator<Shape> comparator)
		{
			if (left < right)
			{
				int mid = left + (right - left) / 2;
				mergeSort(shapes, left, mid, comparator);
				mergeSort(shapes, mid + 1, right, comparator);
				merge(shapes, left, mid, right, comparator);
			}
		}
		
		private static void merge(Shape[] shapes, int left, int mid, int right, Comparator<Shape> comparator)
		{
			int n1 = mid - left + 1;
			
			
		}
	}
