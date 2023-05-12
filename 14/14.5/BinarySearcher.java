
public class BinarySearcher {

	private Comparable[] a;

	public BinarySearcher(Comparable[] a)
	{
		this.a = a;
	}
//search for a name and retrieve phone number
//must create a phone book entry for each name
	public int search(Comparable oneEntry,int low, int high)
	{
		if(low > high){return -1;}
		int mid = (low + high) / 2;
		int diff = a[mid].compareTo(oneEntry);
		if (diff == 0)
		{
			return mid;
		}
		else if (diff <0)
		{
			low = mid + 1;
			return search(oneEntry,low,high);
		}
		else
		{
			high = mid - 1;
			return search(oneEntry,low,high);
		}
	}
}

