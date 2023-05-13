import java.util.Stack;

public class MazeTester {
    public static void main (String[] args){
        Maze test= new Maze(3,4); //????
        test.computePaths();
        boolean done=false;
        Path currentPath=test.getPaths().pop();
        while(test.getPaths().size()>0&&!done){
            currentPath=test.getPaths().pop();
            test.extendLocation(currentPath); //???
            if(test.isExit()){
                done=true;
            }
            else if(test.isIntersection()){
                test.computePaths(currentPath);
            }
            System.out.println(test.toString());
        }
        // for(Path p: test.getPaths()){
        //     System.out.println(p.toString());
        // }
        // System.out.println(test.toString());
        // test.extendLocation(p);
        // System.out.println(test.toString());
        // while(test.getPaths().size()>3){
        //     Ptest.getPaths()
        }
}
