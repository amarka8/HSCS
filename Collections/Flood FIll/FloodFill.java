import java.util.ArrayList;
import java.util.Stack;

public class FloodFill {
    private int[][] board;
    public FloodFill(){
        this.board= new int[10][10];
    }
    public ArrayList<Pair> getNeighborCoordinates(int row, int col){
        ArrayList<Pair> neighbors= new ArrayList<Pair>();
        int[] offsets= {-1,0,1};
        for(int i=0;i<offsets.length;i++){
            for(int z=0;z<offsets.length;z++){
                //you would have to change this line if neighborhood was different
                if((offsets[i]+offsets[z]==1||offsets[i]+offsets[z]==-1)&&(isAllowed(row+offsets[i], col+offsets[z]))&&!(isFilled(row+offsets[i], col+offsets[z]))){
                    neighbors.add(new Pair(row+offsets[i], col+offsets[z]));
                }
            }
        }
        // for(int i=0;i<offsets.length-1;i++){
        //     if(isAllowed(row+offsets[i],col+offsets[i+1])){
        //         neighbors.add(new Pair(row+offsets[i], col+offsets[i+1]));
        //     }
        //     if(isAllowed(row+offsets[i+1],col+offsets[i])){
        //         neighbors.add(new Pair(row+offsets[i+1], col+offsets[i]));
        //     }
        // }
        return neighbors;
    }
    public boolean isAllowed(int row, int col){
        return ((row>=0 && row<board.length) && (col>=0 && col<board[0].length)); 
    }
    public void set(int row,int column, int value){
        board[row][column]=value;
    }
    public boolean isFilled(int row, int col){
        return board[row][col]!=0;
    }
    public String toString(){
        String s="";
        for (int i=0; i<board.length;i++){
            for (int j=0; j<board[i].length;j++){
                s+=board [i][j]+" ";
            }
            s+="\n";
        }
        return s;
    }
    public static void main (String[] args){
        FloodFill test= new FloodFill();
        ArrayList<Pair> neighbors= test.getNeighborCoordinates(0,0);
        for(Pair p: neighbors){
            System.out.println(p.getX()+" "+p.getY());
        }
    }
}
