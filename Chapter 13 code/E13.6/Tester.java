
public class Tester {

    public static void main(String[] args) {

		Sentence s = new Sentence("Mississippi!");
		System.out.println(s.find("sip"));
		System.out.println(s.find("kk"));
		System.out.println(find("Mississippi", "sip"));
		System.out.println(find("Mississippi", "kk"));
    }

   public static boolean find(String lookingIn, String lookingFor)
	{
		if (lookingFor.length() > lookingIn.length()) return false;
		else if (lookingIn.startsWith(lookingFor)) return true;
		return find(lookingIn.substring(1), lookingFor);
	}
}
