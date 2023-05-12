public class Palindrome {
    public boolean isPalindrome(String text,int start, int end){
        if (start==end){return true;}
        return text.charAt(start)==text.charAt(end) & isPalindrome(text,start+1,end-1);
    }

public static void main (String[] args){
    Palindrome p=new Palindrome();
    System.out.println(p.isPalindrome("racedar",0,6));
}
}