public class Triangle {
    private int width;
    public Triangle(int width){
        this.width=width;
    }
    public int getArea(){
        //base case, terminating condition (simplest instance)
        if (width==1)return 1;
        //break into simpler instances and call recursion
        Triangle t= new Triangle(width-1);
        int simplerArea=t.getArea();
        //combine the simpler solution with the current one
        return simplerArea+width;
        //Say I have a width of 4. I am creating 4 objects. Eventually, I return 1 to simpler area. Then, I do 1+2 and I get 3, so 3 is the new simplerArea. Then I add the width (3), and I get 6 for the simplerArea. Finally, I add 4, and I get my final return statement.
    }
    public int getArea2(int width){
        if (width==1)return 1;
        return width+getArea2(width-1);
    }
    // public int getAreaTail
}
