import java.util.LinkedList;
import java.util.ListIterator;

public class Lists {
    private static LinkedList<String> names;
    public Lists(){
        names.addLast("Harry");
        names.addFirst("William");
        names.add("Amar");
        names.add("John");
    }
    // Write a method public static void downsize(LinkedList<String> employeeNames, int n) that removes every nth employee from a linked list.
    public static void downsize(LinkedList<String> employeeNames,int n){
        int i=0;
        ListIterator<String> name= employeeNames.listIterator() ;
        while(name.hasNext()){
            name.next();
            i++;
            if(i%n==0){
                name.remove();
            }
        }
    }
    public static void main (String[] args){
        LinkedList<String> names= new LinkedList<String>();
        names.addLast("Harry");
        names.addFirst("William");
        names.add("Amar");
        names.add("John");
        // downside of linked list, but you can access first and last element easy
        //Write a loop that prints every second element of a linked list of strings called words.
        ListIterator<String> name= names.listIterator() ;
        while(name.hasNext()){
            name.next();
            System.out.println(name.next());
        }
        downsize(names,2);
        System.out.println(names);
    }
}
