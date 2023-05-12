//Look in the API documentation for String methods to use. Contains and indexOf are not allowed. Solution must be recursive.
// #1: Recursively find, true or false, whether a String occurs in another String.
// #2: Recursively find the index (an int) where a String starts in another String, -1 if it is not there.
public class Finder {
    public Boolean isInOriginal(String search,String original){
        if(original.length()==1){
            return original.startsWith(search);
        }
        else if(original.startsWith(search)){
            return true;
        }
        else{
            return isInOriginal(search, original.substring(1));
        }
    }
    public int positionOf(String search, String original,int index){
        if(original.length()==0){
            return -1;
        }
        else if(original.startsWith(search)){
            return index;
        }
        else{
            index+=1;
            return positionOf(search,original.substring(1),index);
        }
    }
}
