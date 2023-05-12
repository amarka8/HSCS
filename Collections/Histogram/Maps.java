import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class Maps {
    private Map<String,Integer> histogram;
    private File f;
    public Maps(String path){
        this.histogram=new TreeMap<String,Integer>();
        this.f= new File(path);
    }
    public static void main (String[] args) throws FileNotFoundException{
        int i=0;
        // Map<String, Color> favoriteColors = new HashMap<String, Color>(); 
        // favoriteColors.put("Juliet", Color.RED);
        // Color julietsFavoriteColor1 = favoriteColors.get("Juliet");
        // favoriteColors.put("Juliet", Color.BLUE);
        // Color julietsFavoriteColor2 = favoriteColors.get("Juliet");
        // System.out.println(julietsFavoriteColor1);
        // System.out.println(julietsFavoriteColor2);
        // Set<String> keySet = favoriteColors.keySet();
        // for (String key : keySet) {
        //     Color color = favoriteColors.get(key);
        // }
        // favoriteColors.remove("Juliet");
        Maps test= new Maps("Alice.txt");
        test.hist();
        Map<String,Integer> frequencies=test.getHist();
        
        for (String key : frequencies.keySet()){
            if(frequencies.get(key)>100){
                System.out.printf("%-20s%10d\n", key, frequencies.get(key));
            }
//             i+=1;
//             if(i==10){
//                 break;
//             }
        }
    }
    public void hist() throws FileNotFoundException{
        Scanner in= new Scanner(f);
        in.useDelimiter("[^a-zA-Z]+");
        while(in.hasNext()){
            String key=clean(in.next());
            //alternative:
            // Integer count = frequencies.get(word);
            // if (count == null) { count = 1; }
            // else { count = count + 1; }
            // frequencies.put(word, count);
            if(!histogram.keySet().contains(key)){
                histogram.put(key, 1);
            }
            else{
                histogram.put(key,histogram.get(key)+1);
            }
        }
        in.close();
    }
    public static String clean(String s){
        String r = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){ 
                r = r + c;
            }
        }
        return r.toLowerCase();
    }
    public Map<String,Integer> getHist(){
        return histogram;
    }
}
