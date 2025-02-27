package utilities;
import java.util.List;
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
		Random rand= new Random(); 
        int pivot = rand.nextInt(high-low)+low; 
         
        Shape temp1=shapes[pivot];  
        shapes[pivot]=shapes[high]; 
        shapes[high]=temp1; 
	}
	
	/**
	 * Partition logic of quick sort. Initial quick sort algorithm was taken from Geeksforgeeks
	 * @param shapes
	 * @param low
	 * @param high
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
            // If current element is smaller than or equal to pivot
        	switch (compareType)
        	{
        	case 'v':
        		if (shapes[j].calcVolume() > pivot.calcVolume()) 
                { 
                    i++; 
     
                    // swap shapes[i] and shapes[j] 
                    Shape temp = shapes[i]; 
                    shapes[i] = shapes[j]; 
                    shapes[j] = temp; 
                } 
        		break;
        	case 'a':
        		if (shapes[j].calcBaseArea() > pivot.calcBaseArea()) 
                { 
                    i++; 
     
                    // swap shapes[i] and shapes[j] 
                    Shape temp = shapes[i]; 
                    shapes[i] = shapes[j]; 
                    shapes[j] = temp; 
                } 
        		break;
        	case 'h':
        		if (shapes[j].getHeight() > pivot.getHeight()) 
                { 
                    i++; 
     
                    // swap shapes[i] and shapes[j] 
                    Shape temp = shapes[i]; 
                    shapes[i] = shapes[j]; 
                    shapes[j] = temp; 
                } 
        		break;
        	}	
            
        }
        // swap arr[i+1] and arr[high] (or pivot) 
        Shape temp = shapes[i+1]; 
        shapes[i+1] = shapes[high]; 
        shapes[high] = temp; 
 
        return i+1;
	}
	
	public static void quicksort(Shape shapes[], int low, int high, char compareType)
	{
		compareType = compareType;
		
		if (low < high)
		{
			int pi = partition(shapes, low, high, compareType);
			
			quicksort(shapes, low, pi-1, compareType);
			quicksort(shapes, pi+1, high, compareType);
		}
	}

}
