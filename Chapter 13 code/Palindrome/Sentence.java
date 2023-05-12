
public class Sentence {
	
	private String text;
	
	public Sentence(String text)
	{
		this.text = text;
	}
	
	public boolean isPalindrome()
	{
      return isPalindrome(text.toLowerCase(), 0, text.length() - 1);
	}
	
	private boolean isPalindrome(String text, int start, int end)
	{
      char first = text.charAt(start);
      char last = text.charAt(end);
      
      if (start >= end) {
         return true;
      }
      if (Character.isLetter(first)) {
         if (Character.isLetter(last)) {
            if (first != last) {
               return false;
            }
            return isPalindrome(text, start + 1, end - 1);
         }
         return isPalindrome(text, start, end - 1);
      }
      return isPalindrome(text, start + 1, end);
      
	}

}
