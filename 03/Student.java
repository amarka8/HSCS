// problem 4
public class Student {
    private String name;
    private double total;
    private double quizNum;
    public Student(String name, double total, double quizNum){
        this.name=name;
        this.total=total;
        this.quizNum=quizNum;
    }
    public String getName(){
        return name;
    }
    public void addQuizScore(double score){
        total+=score;
        quizNum++;
    }
    public double getTotalScore(){
        return total;
    }
    public double getAverageScore(){
       return total/quizNum;
    }
    public static void main (String[] args){
        Student one=new Student("Amar",100,1);
        one.addQuizScore(100);
        System.out.println("Result " + one.getAverageScore());
        System.out.println("Expected " + 100);
    }
}