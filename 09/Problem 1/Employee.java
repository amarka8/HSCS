public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public boolean equals(Object object1){
        if(object1 instanceof Employee){
            Employee employee=(Employee) object1;
            return (employee.getName()==getName() && employee.getSalary()==getSalary());
        }
        else{
            return false;
        }
    }
    public String toString(){
        String s="";
        s+= "Employee "+ getName() +" has a salary of "+ getSalary();
        return s;
    }
}

