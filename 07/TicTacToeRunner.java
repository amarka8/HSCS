import java.util.Scanner;
public class TicTacToeRunner {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        String player="x";
        TicTacToe board= new TicTacToe();
        boolean done=false;
        while(!done){
            System.out.println(board.toString());
            System.out.print("Row for "+ player);
            int row= in.nextInt();
            System.out.print("Column for " + player);
            int col= in.nextInt();
            if(board.isNotAllowed(row,col)||(board.filled(row,col))){
                System.out.println("Cannot Move There");
            }
            else{
                board.set(row,col,player);
            }
            if (player.equals("x")){
                player="o";
            }
            else{
                player="x";
            }
            if(board.done()){
                done=true;
                System.out.println(board.toString());
            }
        }
    }
}
