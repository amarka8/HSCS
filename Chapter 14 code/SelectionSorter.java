
public class SelectionSorter {

	private int[] array;
	
	public SelectionSorter (int[] array)
	{
		this.array = array;
		System.out.println(toString());
	}
   
   public void sortAllInOneMethod() {
		for (int o = 0; o < array.length - 1; o++)
		{
   		int minPos = o;
   		for (int i = o + 1; i < array.length; i++)
   		{
   			if (array[i] < array[minPos])
   			{
   				minPos = i;
   			}
   		}
   		int temp = array[o];
   		array[o] = array[minPos];
   		array[minPos] = temp;
		}
   }
	
	public void sort()
	{
		// The outer loop iterates through the entire array 
		// except for the last element.
		for (int i = 0; i < array.length - 1; i++)
		{
			// It finds the position of the smallest
			// element that has not yet been sorted.
			int minPos = minimumPosition(i);
			// It swaps the smallest element with
			// the one at the current outer loop position.
			swap(minPos, i);
			System.out.println(toString());
		}
	}
	
	private int minimumPosition(int from)
	{
		// It sets aside the current position of the outer loop.
		int minPos = from;
		// The inner loop iterates through the unsorted portion 
		// of the array except for the current position of the 
		// outer loop.
		for (int i = from + 1; i < array.length; i++)
		{
			// It compares the value at the current inner loop
			// position with the value at the current minimum.
			if (array[i] < array[minPos])
			{
				// It sets aside a new minimum position.
				minPos = i;
			}
		}
		return minPos;
	}
	
	private void swap(int minPos, int i)
	{
		// It swaps the values of the minimum position
		// and the current position of the outer loop.
		int temp = array[i];
		array[i] = array[minPos];
		array[minPos] = temp;
		//System.out.println(toString());
	}
	
	public String toString()
	{
		String s = "";
		for (int i : array)
		{
			s += i + " ";
		}
		return s;
	}
}
