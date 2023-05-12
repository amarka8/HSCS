import java.util.Arrays;
public class TicTacToe{
    // Change the tic tac toe code to determine and report winner or draw and exit upon that determination, prevent an invalid move, maintain encapsulation, no break statements, do not throw exceptions.
    private String[][] board;
    private static final int ROWS=3;
    private static final int COLUMNS=3;
    public TicTacToe(){
        board= new String[ROWS][COLUMNS];
        for (int i=0; i<board.length;i++){
            for (int j=0; j<board[i].length;j++){
                board [i][j]=" ";
            }
        }
    }
    public void set(int row,int column,String player){
        board[row][column]=player;
    }
    public boolean isNotAllowed(int row, int column){
        return ((row>2 ||row<0)||(column>2||column<0));
    }
    public boolean filled(int row, int column){
        return !board[row][column].equalsIgnoreCase(" ");
    }
    public boolean done(){
        int score=0;
        if((board[0][0]+board[0][1]+board[0][2]).equals("xxx")||(board[0][0]+board[0][1]+board[0][2]).equals("ooo")){
            score++;
        }
        if((board[1][0]+board[1][1]+board[1][2]).equals("xxx")||(board[1][0]+board[1][1]+board[1][2]).equals("ooo")){
            score++;
        }
        if((board[2][0]+board[2][1]+board[2][2]).equals("xxx")||(board[2][0]+board[2][1]+board[2][2]).equals("ooo")){
            score++;
        }
        if((board[0][0]+board[1][0]+board[2][0]).equals("xxx")||(board[0][0]+board[1][0]+board[2][0]).equals("ooo")){
            score++;
        }
        if((board[0][1]+board[1][1]+board[2][1]).equals("xxx")||(board[0][1]+board[1][1]+board[2][1]).equals("ooo")){
            score++;
        }
        if((board[0][2]+board[1][2]+board[2][2]).equals("xxx")||(board[0][2]+board[1][2]+board[2][2]).equals("ooo")){
            score++;
        }
        if((board[0][0]+board[1][1]+board[2][2]).equals("xxx")||(board[0][0]+board[1][1]+board[2][2]).equals("ooo")){
            score++;
        }
        if((board[0][2]+board[1][1]+board[2][0]).equals("xxx")||(board[0][2]+board[1][1]+board[2][0]).equals("ooo")){
            score++;
        }
        return score>0;     
    }
    public String toString(){
        String s="";
        for (int i=0; i<board.length;i++){
            for (int j=0; j<board[i].length;j++){
                s+=board [i][j];
            }
            s+="\n";
        }
        return s;
    }
    public static void main (String[] args){
        TicTacToe board= new TicTacToe();
        System.out.println(board.toString());
    }
}