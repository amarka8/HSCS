import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class FloodFillTester {
    public static void main (String[] args){
        int count=1;
        Stack<Pair> storage=new Stack<Pair>();
        ArrayList<Pair> neighbors= new ArrayList<Pair>();
        FloodFill algorithm= new FloodFill();
        Scanner in= new Scanner(System.in);
        System.out.print("Enter row position in array: ");
        int x=in.nextInt();
        System.out.print("Enter column position in array: ");
        int y=in.nextInt();
        in.close();
        Pair start= new Pair(x, y);
        storage.push(start);
        while(storage.size()>0){
            Pair location=storage.pop();
            if(!algorithm.isFilled(location.getX(),location.getY())){
                algorithm.set(location.getX(),location.getY(),count);
                count++;
            }
            neighbors=algorithm.getNeighborCoordinates(location.getX(), location.getY());
            for(Pair p: neighbors){
                System.out.println(p.getX()+" "+p.getY());
                storage.push(p);
            }
            System.out.println(algorithm.toString());
        }
    }
}
