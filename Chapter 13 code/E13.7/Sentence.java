
public class Sentence {
	
	private String sentence;
	
	public Sentence (String sentence)
	{
		this.sentence = sentence;
	}
	
	public int indexOf(String lookingFor)
	{
		return indexOf(lookingFor, 0);
	}

	private int indexOf(String lookingFor, int index)
	{
		if (sentence.length() < lookingFor.length()) return -1;
		else if (sentence.startsWith(lookingFor)) return index;
		Sentence smallerSentence = new Sentence(sentence.substring(1));
		return smallerSentence.indexOf(lookingFor, index + 1);
	}
	
	public int find(String string)
	{
		return find(string, 0);
	}
	
	private int find(String string, int start)
	{
		if (string.length() > sentence.substring(start).length())
		{
			return -1;
		}
		if (string.substring(start).startsWith(string))
		{
			return start;
		}
		return find(string, start + 1);
	}
	
}
