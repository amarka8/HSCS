public class Customer {
    private int choice;
    private String name;
    public Customer(String name, int choice){
        this.name=name;
        this.choice=choice;
    }
    public int getChoice(){
        return choice;
    }
}
