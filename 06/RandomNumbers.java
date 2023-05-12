// 1. uses a while loop and Math.random() to generate 100000 random integers between 1 inclusive and
// 1000 inclusive,
// 2. finds and reports the average, minimum, maximum, and range.
// Loop is off by one. Code does not report anything. Arithmetic error.
public class RandomNumbers {
    public static void main (String[] args){
        double i=0;
        double sum=0;
        double minimum=0;
        double max=0;
        while (i<100000){
            int rand= (int) (Math.random()*1000)+1;
            minimum=Math.min(rand,minimum);
            max=Math.max(rand,max);
            sum+=rand;
            i++;
        }
        double ave= sum/i;
        double range=max-minimum;
        System.out.println(ave+"\n"+ range +"\n"+minimum+"\n"+ max);
    }
}