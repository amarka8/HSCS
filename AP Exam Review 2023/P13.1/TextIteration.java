
public class TextIteration {

	private String text;

	public TextIteration (String text)
	{
		this.text = text;
	}

	public String reverse()
	{
		String returnValue = "";
		for (int i = text.length() - 1; i >= 0; i--)
		{
			returnValue = returnValue + text.substring(i, i + 1);
		}
		return returnValue;
	}
}
