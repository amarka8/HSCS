import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Write a program that reads text from a file and breaks it up into individual words. Insert the words into a tree set. At the end of the input file, print all words, followed by the size of the resulting set. This program determines how many unique words a text file has.
public class UniqueWords {
    public static void main(String[] args) throws FileNotFoundException{
        Set<String> entries= new HashSet<String>();
        Map<String,Integer> histogram=new TreeMap<String,Integer>();
        Scanner in= new Scanner(new File("/Users/amark/Library/CloudStorage/OneDrive-SharedLibraries-MemphisUniversitySchool/Jonathan Saunders - Amar Kanakamedala/Collections/WarandPeace.txt"));
        // ^ indicates other than
        in.useDelimiter("[^a-zA-Z]+");
        while(in.hasNext()){
            String key=in.next().toLowerCase();
            entries.add(key);
            histogram.put(key,1);
        }
        in.close();
        System.out.println(entries.size());
        System.out.println(histogram.size());
    }
}

