public class SortTester {
    public static void main(String args[]){
        Coin nickel= new Coin(5,"Nickel");
        Coin dime= new Coin(10,"Dime");
        Coin penny= new Coin(1,"Penny");
        Coin collection[]= {nickel,penny,dime};
        SelectionSort sorter= new SelectionSort(collection);
        System.out.println(sorter.toString());
        sorter.sort();
        System.out.println(sorter.toString());
    }
}
