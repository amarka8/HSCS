// The Maze class has a method that extends a location until it reaches an intersection or exit, or until it is blocked by a wall, and a method that computes all locations from an intersection point.
import java.util.Stack;
import java.util.Arrays;
public class Maze {
    private String board[][];
    // private Stack<Path> paths;
    int x;
    int y;
    public Maze(int x, int y){
        this.x=x;
        this.y=y;
        // paths= new Stack<Path>();
        this.board=new String[8][8];
        for(int i=0;i<board.length;i+=7){
            if(i==7){
                board[3][7]="*";
            }
            board[1][i]="*";
            for(int z=0;z<board.length;z++){
                if(z>=1&&z<=6){
                    board[1][z]=" ";
                    board[3][z]=" ";
                }
                board[i][z]="*";
            }
        }
        for(int i=2;i<board.length-1;i+=2){
            for(int z=0;z<board.length;z++){
                if(z==4){
                    board[i][z]=" ";
                }
                else{
                    board[i][z]="*";
                }
            }
        }
        for(int i=0;i<board.length;i++){
            if(i<1||i>=5){
                board[5][i]="*";
            }
            else{
                board[5][i]=" ";
            }
        }
        board[3][0]=" ";
    }
    // public Stack<Path> getPaths(){
    //     return paths;
    // }
    public boolean extendLocation(int x, int y, Path path){
        Stack<Path> paths=new Stack<Path>();
        Path[] subPaths=computePaths(x,y);
        if (subPaths!=null){
            for(Path p:subPaths){
                extendLocation(x,y,paths);
            }
        } 
        else{
            switch (path.getDirection()) {
                case "North": y--;
                case "South": y++;
                case "East": x++;
                case "West": x--;
            }
            extendLocation(x, y, path);
        }
    //     int increment;
    //     boolean intersection=false;
    //     if(p.getDirection().equals("North")){
    //         increment=-1;
    //         while(!isBlocked(,p.getCol())&&!isExit()){
    //             p.increaseRow(increment);
    //             if()
    //         }
    //     }
    //     else if(location.getDirection().equals("East")){
    //         increment=1;
    //         while(!isBlocked(location.getRow(),location.getCol())&&!intersection&&!isExit()){
    //             location.increaseCol(increment);
    //             intersection=isIntersection();
    //         }
    //     }
    //     else if(location.getDirection().equals("South")){
    //         increment=1;
    //         while(!isBlocked(location.getRow(),location.getCol())&&!intersection&&!isExit()){
    //             location.increaseRow(increment);
    //             intersection=isIntersection();
    //         }
    //     }
    //     else{
    //         increment=-1;
    //         while(!isBlocked(location.getRow(),location.getCol())&&intersection&&!isExit()){
    //             location.increaseCol(increment);
    //             intersection=isIntersection();
    //         }
    //     }
    }
    public void computePaths(){
        // int paths=0;
        // int count=0;
        int[] offsets= {0,-1,1,0,0,1,-1,0};
        String[] direction= {"West","South","East","North"};
        for(int i=0;i<offsets.length;i+=2){
            if(!isBlocked(x+offsets[i], y+offsets[i+1])){
                paths.push(new Path(x,y, direction[i/2]));
                    // paths++;
            }
        }
            // count++;
        // return paths;
    }
    public void computePaths(Path p){
        int[] offsets= {0,-1,1,0,0,1,-1,0};
        String[] direction= {"East","North","South","West"};
        /**
         * array.length-indexPos-1: 
         * East: 4-1-0=3 (west)
         * West: 4-1-3=0: (east)
         * North: 4-1-1=2 (south)
         * South: 4-1-2=1(North)
         */
        for(int i=0;i<offsets.length;i+=2){
            if(!isBlocked(x+offsets[i], y+offsets[i+1])){
                int index= direction.length-1-Arrays.binarySearch(direction,p.getDirection());
                if(i/2!=index){
                    paths.push(new Path(x,y, direction[i/2]));
                }
            }
        }
    }
    public boolean isExit(int x, int y){
        return (x==0||y==0||y==board[0].length-1||x==board.length-1)&&(board[x][y].equals(" "));
    }
    public boolean isBlocked(int x, int y){
        return board[x][y].equals("*");
    }
    public boolean isIntersection(){
        int paths=0;
        int[] offsets= {0,-1,1,0,0,1,-1,0};
        for(int i=0;i<offsets.length;i+=2){
            if(!isBlocked(x+offsets[i], y+offsets[i+1])){
                    paths++;
            }
        }
        /**
         * take any point in the maze- it will have four neighbors. 
         * 1. 4 blocked- not an intersection
         * 2. 3 blocked and one open- dead end
         * 3. 1 blocked, 3 open- intersection (one is previously visited, but other two make it an intersection)
         * 4. 2 blocked, 2 open- not an intersection (one will be previously visited)
         */
        if(paths>=3){
            return true;
        }
        return false;
    }
    // public String toString(){
    //     String s="";
    //     for (int i=0; i<board.length;i++){
    //         for (int j=0; j<board[i].length;j++){
    //             if(i==location.getRow()&&j==location.getCol()){
    //                 s+=". ";
    //             }
    //             else{
    //                 s+=board [i][j]+" ";
    //             }
    //         }
    //         s+="\n";
    //     }
    //     return s;
    // }
}
