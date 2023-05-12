/**
 * @(#)PermutationTester.java
 *
 * PermutationTester application
 *
 * @author
 * @version 1.00 2011/3/20
 */

import java.util.*;

public class PermutationTester {

    public static void main(String[] args) {
    	
    	//String s1 = "Hello";
    	//System.out.println("test:" + s1.substring(5));
    	
    	
		PermutationGenerator generator = new PermutationGenerator("hello");
		ArrayList<String> permutations = generator.getPermutations();
		for (String s : permutations)
		{
			System.out.println(s);
		}
		//permutations = getPermutations("eat");
		//for (String s : permutations)
		//{
		//	System.out.println(s);
		//}
    }
	public static ArrayList<String> getPermutations(String word) {
		ArrayList<String> p = new ArrayList<String>();
		if (word.length() == 0) 	{
			p.add(word);
			return p;
		}
		for (int i = 0; i < word.length(); i++) {
			String sw = word.substring(0, i) + word.substring(i + 1);
			ArrayList<String> swp = getPermutations(sw);
			for (String s : swp) {
				p.add(s + word.charAt(i));
			}
		}
		return p;
	}    
}
