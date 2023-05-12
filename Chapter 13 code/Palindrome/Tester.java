
public class Tester {

	public static void main(String[] args) {

		Sentence s = new Sentence("abccba");
		System.out.println(s.isPalindrome());
		s = new Sentence("abcba");
		System.out.println(s.isPalindrome());
		s = new Sentence("abcdef");
		System.out.println(s.isPalindrome());
		s = new Sentence("Madam, I'm Adam!");
		System.out.println(s.isPalindrome());


		/*Sentence s = new Sentence("abcdcba");
		System.out.println(s.isPalindrome());
		s = new Sentence("Madam, I'm Adam!");
		System.out.println(s.isPalindrome());

		s = new Sentence("abcdbca");
		System.out.println(s.isPalindrome());
		s = new Sentence("Madam, I'm Ada!");
		System.out.println(s.isPalindrome());*/

	}

}
