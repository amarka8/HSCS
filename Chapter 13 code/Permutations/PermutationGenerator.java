/**
 * @(#)PermutationGenerator.java
 *
 *
 * @author
 * @version 1.00 2011/3/20
 */

import java.util.*;

public class PermutationGenerator {

	private String word;

    public PermutationGenerator(String word) {
    	this.word = word;
    }

    public ArrayList<String> getPermutations()
    {
    	ArrayList<String> permutations = new ArrayList<String>();

    	if (word.length() == 0)
    	{
    		permutations.add(word);
    		return permutations;
    	}

    	for (int i = 0; i < word.length(); i++)
    	{
    		String shorterWord = word.substring(0, i) + word.substring(i + 1);

    		PermutationGenerator shorterPermutationGenerator = new PermutationGenerator(shorterWord);
    		ArrayList<String> shorterWordPermutations = shorterPermutationGenerator.getPermutations();

    		for (String s : shorterWordPermutations)
    		{
    			permutations.add(word.charAt(i) + s);
    		}
    	}

    	return permutations;
    }
    

    

}

/*
"eat" 0
"at" 0
	"t" 0
		""
	"t"
"at"
"eat"

"eat" 0
"at" 1
	"a" 0
		""
	"a"
"ta"
"eta"

"eat" 1
"et" 0
	"t" 0
		""
	"t"
"et"
"aet"

"eat" 1
"et" 1
	"e" 0
		""
	"e"
"te"
"ate"

"eat" 2
"ea" 0
	"a" 0
		""
	"a"
"ea"
"tea"

"eat" 2
"ea" 1
	"e" 0
		""
	"e"
"ae"
"tae"
*/