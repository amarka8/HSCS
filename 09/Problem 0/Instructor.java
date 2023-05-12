public class Instructor extends Student{
    private double salary;
    public Instructor(String name, double bYear, String major, double salary){
        super(name,bYear,major);
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}
