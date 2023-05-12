
public class Tester {

	public static void main(String[] args) {

		Sentence s = new Sentence("This is a test!");
		System.out.println(s.indexOf("this"));
		System.out.println(s.indexOf("test"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf("!"));
		System.out.println(s.indexOf("lkjlkj"));
		
		System.out.println(s.find("test"));

		
	}
	
}
