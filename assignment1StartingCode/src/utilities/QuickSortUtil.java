package utilities;
import java.util.Random;

import shapes.Shape;

/**
 * Class that contains the Quick Sort method as a utility
 * @author Ben Feraer
 */
public class QuickSortUtil
{
	/**
	 * Method that generates a random index within the Shapes array. Initial quick sort algorithm was taken from Geeksforgeeks
	 * @param shapes Array of Shapes
	 * @param low Lower index limit of the array
	 * @param high Higher index limit of the array
	 */
	public static void random(Shape[] shapes, int low, int high)
	{
		if (low == high) return; //Needed to prevent invalid range
		Random rand= new Random(); 
        int pivot = low + rand.nextInt(high-low+1); 
         
        Shape temp1=shapes[pivot];  
        shapes[pivot]=shapes[high]; 
        shapes[high]=temp1; 
	}
	
	/**
	 * Partition logic of quick sort. Initial quick sort algorithm was taken from Geeksforgeeks
	 * @param shapes
	 * @param low lowest limit of the array length
	 * @param high highest limit of the array length
	 * @return next partition value
	 */
	public static int partition(Shape shapes[], int low, int high, char compareType)
	{
		// pivot is chosen randomly 
        random(shapes,low,high);
        Shape pivot = shapes[high]; 
     
 
        int i = (low-1); // index of smaller element 
        for (int j = low; j < high; j++) 
        { 
        	boolean swap = false; //Swap indicator for after comparing values depending on the following switch cases

        	switch (compareType)
        	{
        	case 'v':
        		swap = (shapes[j].compareVolume(pivot)) > 0;
        		break;
        	case 'a':
        		swap = (shapes[j].compareBaseArea(pivot)) > 0;
        		break;
        	case 'h':
        		swap = (shapes[j].compareTo(pivot)) > 0;
        		break;
        	}	
        	
        	if(swap)
        	{
        		i++;
        		Shape temp = shapes[i];
        		shapes[i] = shapes[j];
        		shapes[j] = temp;
        	}
            
        }
        
        //Below swaps pivot into the proper position
        Shape temp = shapes[i+1]; 
        shapes[i+1] = shapes[high]; 
        shapes[high] = temp; 
 
        return i+1;
	}
	
	/**
	 * Main quick sort method that will be called in the sortManager
	 * @param shapes
	 * @param low
	 * @param high
	 * @param compareType
	 */
	public static void quicksort(Shape shapes[], int low, int high, char compareType)
	{	
		if (low < high)
		{
			int pi = partition(shapes, low, high, compareType);
			
			if (pi - 1 > low)
			{
				quicksort(shapes, low, pi-1, compareType);
			}
			
			if (pi + 1 < high)
			{
				quicksort(shapes, pi+1, high, compareType);
			}
		}
	}

}
