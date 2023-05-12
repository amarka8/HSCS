public class Executive extends Manager{
    public Executive(String name, double salary, String department){
        super(name,salary,department);
    }
    public boolean equals(Object object1){
        if(object1 instanceof Executive){
            Executive executive=(Executive) object1;
            return (super.equals(object1));
        }
        else{
            return false;
        }
    }
    public String toString(){
        String s="";
        s+=super.toString();
        s+= " as an Executive";
        return s;
    }
}