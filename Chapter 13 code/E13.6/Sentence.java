
public class Sentence {

	private String text;

	public Sentence (String text)
	{
		this.text = text;
	}

	public String getText()
	{
		return text;
	}

	public boolean find(String string)
	{
		if (string.length() > text.length())
		{
			return false;
		}
		else if (text.startsWith(string))
		{
			return true;
		}
		Sentence smallerSentence = new Sentence(text.substring(1));
		return smallerSentence.find(string);
	}
	
	public static boolean find(String lookingIn, String lookingFor)
	{
		if (lookingFor.length() > lookingIn.length())
		{
			return false;
		}
		else if (lookingIn.startsWith(lookingFor))
		{
			return true;
		}
		return find(lookingIn.substring(1), lookingFor);
	}
}
