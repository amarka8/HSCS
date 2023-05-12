
public class Text {

	private String text;

	public Text (String text)
	{
		this.text = text;
	}

	public String reverse()
	{
		if (text.length() == 1) {return text;}
		String character = text.substring(0, 1);
		Text smallerText = new Text(text.substring(1));
		String reverseText = smallerText.reverse();
		return reverseText + character;
	}

	public static String reverse(String s)
	{
		//if (s.length() == 1) {return s;}
		//String character = s.substring(s.length()-1);
		//return character + reverse(s.substring(0, s.length()-1));
		if (s.length() == 1) {return s;}
		String character = s.substring(0, 1);
		return reverse(s.substring(1)) + character;
	}

	public static String reverse(String s, String r)
	{
		if (s.length() == 0) {return r;}
		String character = s.substring(0, 1);
		return reverse(s.substring(1), character + r);
	}

	public static String reverse2(String s, String r)
	{
		if (s.length() == 1) {return s+r;}
		r = s.substring(0, 1);
		return reverse(s.substring(1), r);
	}
}
