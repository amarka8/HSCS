
public class BinarySearcher {
	
	private int[] a;
	
	public BinarySearcher(int[] a)
	{
		this.a = a;
	}
	
	public int search(int lookingFor)
	{
		int low = 0;
		int high = a.length -1;
		while (low <= high)
		{
			int mid = (low + high)/2;
			int diff = a[mid] - lookingFor;
			if (diff == 0)
			{
				return mid;
			}
			else if (diff < 0)
			{
				low = mid + 1;
			}
			else if (diff > 0)
			{
				high = mid - 1;
			}
		}
		return -1;
	}

	public int searchRecursive(int lookFor)
	{
		return searchHelper(lookFor, 0, a.length - 1);
	}

	private int searchHelper(int lookFor, int low, int high)
	{
		int mid = (low + high) / 2;
		int comparison = a[mid] - lookFor;
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
