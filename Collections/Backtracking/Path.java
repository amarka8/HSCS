// a Path object is constructed with a starting position and a direction (North, East, South, or West). 
public class Path {
    private int row;
    private int col;
    private String direction;
    public Path(int row, int col, String direction){
        this.row=row;
        this.col=col;
        this.direction=direction;
    }
    public String getDirection(){
        return direction;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public String toString(){
        String s=row+ ","+col+" "+getDirection();
        return s;
    }
    public void setDirection(String s){
        direction=s;
    }
    public void increaseRow(int amount){
        row+=amount;
    }
    public void increaseCol(int amount){
        col+=amount;
    }
}
