
public class TextHelper {

	private String text;

	public TextHelper (String text)
	{
		this.text = text;
	}

	public String reverse()
	{
		return reverse(0);
	}
	public String reverse(int start)
	{
		if (start >= text.length() - 1)
		{
			return text.substring(text.length() - 1, text.length());
		}
		String character = text.substring(start, start + 1);
		return reverse(start + 1) + character;
	}

}
