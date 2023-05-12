import java.util.Arrays;

public class InsertionSorterAlt
{
	private Comparable[] a;

	/**
	Constructs an insertion sorter.
	@param anArray the array to sort
	*/
	public InsertionSorterAlt(Comparable[] a)
	{
		this.a = a;
	}
	
	public void sortAscending()
	{
		sort(1);
	}

	public void sortDescending()
	{
		sort(-1);
	}

	/**
	Sorts the array managed by this insertion sorter.
	*/
	private void sort(int sortDirection)
	{
		/*for (int o = 1; o < a.length; o++)
		{
			int next = a[o];
			int i = o;
			while(i > 0 && a[i - 1] > next)
			{
				a[i] = a[i - 1];
				i--;
			}
			a[i] = next;
		}*/
		for (int i = 1; i < a.length; i++)
		{
			Comparable next = a[i];
			// Find the insertion location
			// Move all larger elements up
			int j = i;
			while (j > 0 && sortDirection * a[j - 1].compareTo(next) > 0)
			{
				a[j] = a[j - 1];
				j--;
			}
			// Insert the element
			a[j] = next;
		}
	}
	
	public static Comparable[] sort(Comparable[] c, boolean sortDirection)
	{
		Comparable[] a = Arrays.copyOf(c, c.length);
		for (int i = 1; i < a.length; i++)
		{
			Comparable next = a[i];
			int j = i;
			//while (j > 0 && a[j - 1].compareTo(next) < 0)
			while (j > 0 && ((sortDirection && a[j - 1].compareTo(next) > 0) || (!sortDirection && a[j - 1].compareTo(next) < 0)))
			{
				a[j] = a[j - 1];
				j--;
			}
			a[j] = next;
		}
		return a;
	}
	
	public String toString()
	{
		String s = "";
		for (Comparable i : a)
		{
			s += i.toString() + "\n";
		}
		return s;
	}	
	
}