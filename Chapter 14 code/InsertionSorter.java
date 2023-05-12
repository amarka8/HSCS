
public class InsertionSorter {
	
	private int[] a;
	
	public InsertionSorter(int[] a)
	{
		this.a = a;
      System.out.println(toString());
	}
	
	public void sort()
	{
		// The outer loop iterates through the entire
		// array excluding the first element.
		for (int o = 1; o < a.length; o++)
		{
			// The value at the current outer loop
			// position is set aside for later comparison
			// and insertion.
			int next = a[o];
			int i = o;
			// The inner loop iterates backwards through 
			// the sorted portion of the array.
			while(i > 0 && a[i - 1] > next)
			{
				// Larger elements are shifted.
				a[i] = a[i - 1];
				i--;
			}
			// The value set aside is inserted in the 
			// remaining hole.
			a[i] = next;
         System.out.println(toString());
		}
	}

	public String toString()
	{
		String s = "";
		for (int i : a)
		{
			s += i + " ";
		}
		return s;
	}

}
