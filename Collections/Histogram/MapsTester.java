import java.util.Map;
public class MapsTester {
    public static void main(String[] args){
        Maps test= new Maps("/Users/amark/Library/CloudStorage/OneDrive-SharedLibraries-MemphisUniversitySchool/Jonathan Saunders - Amar Kanakamedala/Collections/Alice.txt");
        Map<String,Integer> frequencies=test.getHist();
        for (String key : frequencies.keySet()){
            System.out.println(key + " : "+ frequencies.get(key));
        }
    }
}
