public class MergeSorter {

	private String[] a;

	public MergeSorter(String[] a)
	{
		this.a = a;
	}

	public void sort()
	{
		if (a.length <= 1) return;
		String[] first = new String[a.length/2];
		String[] second = new String[a.length - first.length];
		for (int i = 0; i < first.length; i++)
		{
			first[i] = a[i];
		}
		for (int i = 0; i < second.length; i++)
		{
			second[i] = a[i + first.length];
		}
		MergeSorter firstSorter = new MergeSorter(first);
		MergeSorter secondSorter = new MergeSorter(second);
		firstSorter.sort();
		secondSorter.sort();
		merge(first, second);
	}

	private void merge(String[] first, String[] second)
	{
		int iFirst = 0;
		int iSecond = 0;
		int j = 0;

		while (iFirst < first.length && iSecond < second.length)
		{
			if (first[iFirst].compareTo(second[iSecond])<0)
			{
				a[j] = first[iFirst];
				iFirst++;
			}
			else
			{
				a[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}

		while (iFirst < first.length)
		{
			a[j] = first[iFirst];
			iFirst++;
			j++;
		}

		while (iSecond < second.length)
		{
			a[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}

}