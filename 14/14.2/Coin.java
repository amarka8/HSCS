public class Coin implements Comparable<Coin> {
    private String name;
    private double value;
    public Coin (double value, String name){
        this.value=value;
        this.name=name;
    }
    public double getValue(){
        return value;
    }
    public String getName(){
        return name;
    }
    public int compareTo(Coin coin){
        if(getValue()<coin.getValue()){
            return -1;
        }
        else if (getValue()==coin.getValue()){
            return 0;
        }
        else{
            return 1;
        }
    }
    public String toString(){
        String s="";
        s+=getName()+" : "+getValue()+ " cents";
        return s;
    }
}
