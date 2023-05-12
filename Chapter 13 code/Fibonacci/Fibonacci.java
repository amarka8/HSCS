
public class Fibonacci {

	private long calls;

	public long getCalls()
	{
		return calls;
	}

	public void resetCalls()
	{
		calls = 0;
	}

    public long fib(int n)
    {
    	calls++;
    	if (n <= 2) {return 1;}
    	long olderValue = 1;
    	long oldValue = 1;
    	long newValue = 1;
    	for (int i = 3; i <= n; i++)
    	{
	    	calls++;
    		newValue = oldValue + olderValue;
    		olderValue = oldValue;
    		oldValue = newValue;
    	}
    	return newValue;
    }

    public long fibRecursive(int n)
    {
      calls++;
      if (n <= 2) return 1;
      return fibRecursive(n - 1) + fibRecursive(n - 2);
    
    }

}
