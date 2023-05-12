public class CartTester {
    public static void main (String[] args){
        Cart cart= new Cart();
        cart.addItem("Broccoli", "Jeff", 8,5);
        cart.addItem("Cauliflower", "Joe", 10,5);
        cart.addItem("Okra", "John", 12,5);
        cart.addItem("Okra", "John", 12,5);
        cart.removeItem("Okra");
        System.out.println(cart.getTotalCost());
        System.out.println(cart.mostExpensive());
        System.out.print(cart.chooseItem());
        System.out.println(cart.toString());
    }
}
