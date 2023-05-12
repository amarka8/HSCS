public class Student extends Person{
    private String major;
    public Student(String name, double bYear, String major){
        super(name,bYear);
        this.major=major;
    }
    public String getMajor(){
        return major;
    }
}
