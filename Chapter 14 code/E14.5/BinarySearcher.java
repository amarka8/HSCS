public class BinarySearcher {

	private Comparable[] c;

	public BinarySearcher(Comparable[] c)
	{
		this.c = c;
	}

	public int search(Comparable lookFor)
	{
		int low = 0;
		int high = c.length - 1;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			int comparison = c[mid].compareTo(lookFor);

			if (comparison == 0)
			{
				return mid;
			}
			else if (comparison < 0)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return -1;
	}

	public int searchRecursive(Comparable lookFor)
	{
		return searchHelper(lookFor, 0, c.length - 1);
	}

	private int searchHelper(Comparable lookFor, int low, int high)
	{
		int mid = (low + high) / 2;
		int comparison = c[mid].compareTo(lookFor);
		if (low > high)
		{
			return -1;
		}
		else if (comparison == 0)
		{
			return mid;
		}
		else if (comparison < 0)
		{
			return searchHelper(lookFor, mid + 1, high);
		}
		else
		{
			return searchHelper(lookFor, low, mid - 1);
		}
	}

}
