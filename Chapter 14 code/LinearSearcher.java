
public class LinearSearcher {

	private int[] a;
	
	public LinearSearcher(int[] a)
	{
		this.a = a;
	}
	
	public int search(int lookingFor)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (lookingFor == a[i]) return i;
		}
		return -1;
	}
	
}
