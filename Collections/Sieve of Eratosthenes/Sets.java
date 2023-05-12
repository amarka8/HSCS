import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    //sieve of eratosthenes
    public static Set<Integer> setBuilderComposite(int n){
        Set<Integer> numbersHash=new HashSet<Integer>();
        for (int i=2;i<=Math.sqrt(n);i++){
            for(int z=2;z<=n/i;z++){
                numbersHash.add(i*z);
            }
        }
        return numbersHash;
    }
    public static Set<Integer> setBuilderAll(int n){
        Set<Integer> numbersHash=new HashSet<Integer>();
        for (int i=2;i<=n;i++){
            numbersHash.add(i);
        }
        return numbersHash;
    }
    public static void main (String[] args){
        //sieve of eratosthenes with an example number 120
        Set<Integer> nonPrime = setBuilderComposite(10000);
        Set<Integer> all=setBuilderAll(10000);
        Set<Integer> Prime=new TreeSet<Integer>();
        for(int number: all){
            if(!nonPrime.contains(number)){
                Prime.add(number);
            }
        }
        System.out.println(Prime);
    }
}
