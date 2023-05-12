public class Coin implements Comparable<Coin> {
    private double value;
    private String name;
    public Coin(double d, String string) {
    }
    public double getValue(){
        return value;
    }
    public int compareTo(Coin coin){
        if(value == coin.getValue())return 0;
        else if(value>coin.getValue())return 1;
        else return -1;
    }
}
