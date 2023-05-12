/**
 * @(#)P131.java
 *
 * P131 application
 *
 * @author
 * @version 1.00 2011/3/16
 */

public class P131 {

    public static void main(String[] args) {

		Text text = new Text("Hello!");
		//System.out.println(text.reverse());

		System.out.println(Text.reverse("Hello!"));

		System.out.println(Text.reverse("Hello!", ""));

		//TextHelper textHelper = new TextHelper("Hello Helper!");
		//System.out.println(textHelper.reverse());

		//TextIteration textIteration = new TextIteration("Hello Iteration!");
		//System.out.println(textIteration.reverse());
    }
}
