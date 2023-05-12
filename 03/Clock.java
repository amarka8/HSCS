public class Clock {
    private String time;
    //overload to have object be able to handle different inputs
    public Clock(String time) {
        this.time=time;
    }
    public Clock() { 
    }
    //mutator
    public void set(String current){
        this.time= current;
    }
    //accesor
    public String show() {
       return this.time;
    }
    public static void main(String[] args){
        Clock now = new Clock();
        now.set("7:06");
        System.out.println(now.show());
    }
}


