public class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String department){
        super(name,salary);
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public boolean equals(Object object1){
        if(object1 instanceof Manager){
            Manager manager=(Manager) object1;
            return (super.equals(object1)&&manager.getDepartment()==getDepartment());
        }
        else{
            return false;
        }
    }
    public String toString(){
        String s="";
        s+=super.toString();
        s+= " and is in department "+ getDepartment();
        return s;
    }
}
