
public class MergeSorter {
	
	private int[] a;
	
	public MergeSorter (int[] a)
	{
		this.a = a;
	}
	
	public void sort()
	{
		// One element is sorted with itself, so that is the
		// terminating condition.
		if (a.length <= 1) return;
		// It creates new arrays half the length of the current one.
		int[] first = new int[a.length/2];
		int[] second = new int[a.length - first.length];
		// It copies from the parent array into the new arrays.
		for (int i = 0; i < first.length; i++)
		{
			first[i] = a[i];
		}
		for (int i = 0; i < second.length; i++)
		{
			second[i] = a[i + first.length];
		}
		// It calls the recursion on the halves.
		MergeSorter firstSorter = new MergeSorter(first);
		MergeSorter secondSorter = new MergeSorter(second);
		firstSorter.sort();
		secondSorter.sort();
		// It merges the sorted halves.
		merge(first, second);
	}
	
	private void merge(int[] first, int[] second)
	{
		int iFirst = 0;
		int iSecond = 0;
		int iParent = 0;
		// The two arrays are merged by comparing the elements
		// of each in order.
		while(iFirst < first.length && iSecond < second.length)
		{
			if (first[iFirst] < second[iSecond])
			{
				a[iParent] = first[iFirst];
				iFirst++;
			}
			else
			{
				a[iParent] = second[iSecond];
				iSecond++;
			}
			iParent++;
		}
		
		// There may have been elements left over in either
		// the first or second array that are not yet merged.
		// This code just appends those left over elements
		// to the parent array.
		while(iFirst < first.length)
		{
			a[iParent] = first[iFirst];
			iFirst++;
			iParent++;
		}

		// Only one of the while loops will have a true
		// condition since there can be left over elements
		// in only one of the arrays.
		while(iSecond < second.length)
		{
			a[iParent] = second[iSecond];
			iSecond++;
			iParent++;
		}
	}
	
	public String toString()
	{
		String s = "";
		for (int i : a)
		{
			s += i + "\n";
		}
		return s;
	}


}
