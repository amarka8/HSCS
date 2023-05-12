public class Supertester {
    public static void main (String args[]){
//         1. Declare 3 variables of type Employee. Assign to one an object of type Employee, to the next an object of type
// Manager, and to the last an object of type Executive. What do you have to do to convert a subclass type to its superclass type?
        Employee jeff=new Employee("Jeff", 100);
        Employee jeffrey= new Manager("Jeffrey", 1000, "Sales");
        Employee jeffreyII= new Executive("Jeffrey II", 10000, "Sales");
//to convert a subclass object type to superclass variable type, you can assign an object type of the subclass to a variable type of the superclass


// 2. Print the results of the toString method for each Employee variable. Which toString method is called, the
// one on the superclass, or the one on the subclass? Does the variable type or the object type determine which
// method override is called?
System.out.println(jeff.toString());
System.out.println(jeffrey.toString());
System.out.println(jeffreyII.toString());
//the object type toString() method is called (subclass method)

// 3. Declare a variable of type Manager. Assign to it the variable from #1 that holds the Manager. Declare a variable
// of type Executive. Assign to it the variable from #1 that holds the Executive. What do you have to do to
// convert a superclass type to a subclass type?
        Manager differentJeffrey=(Manager)jeffrey;
        Executive differentJeffreyII=(Executive)jeffreyII;
//to convert a superclass variable type to a subclass variable type, you must cast it as the subclass at runtime because the variable types are different

// 4. Print the results of the toString method for the Manager and Executive variables. Which toString
// method is called, the one on the superclass, or the one on the subclass? Does the variable type or the object type
// determine which method override is called?
System.out.println(differentJeffrey.toString());
System.out.println(differentJeffreyII.toString());
//the object type determines which method gets called (subclass method)

// 5. Declare two variables of type Executive. Assign to each an object of type Executive with different data. In
// the Employee, Manager, and Executive classes, override the equals method. Print the results of whether
// the first Executive equals the second two. Test the equals methods from the Employee and Manager
// classes. Why do you have to cast the Object type in the equals methods?
Executive amar= new Executive("Amar", 500, "Mathematics");
Executive amara=new Executive("Amara", 5000, "Legal");
System.out.println(amar.equals(amara));
System.out.println(amar.equals(differentJeffreyII));
System.out.println(amara.equals(differentJeffreyII));
System.out.println(jeffrey.equals(differentJeffrey));
System.out.println(jeffreyII.equals(differentJeffreyII));
//if the object is not casted at runtime, a compiler error will occur because instance methods belonging to employee/manager/exeuctive cannot be run on a variable with type object. Whether a method can run is dependent on variable type, and the getter methods do not belong to the object class.
    }
}
