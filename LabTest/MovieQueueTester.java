public class MovieQueueTester { // amar

    public static void main(String[] args) {

    	Queue queue = new Queue();

    	queue.addMovie("Attack of the 50 Foot Woman", 1);
    	queue.addMovie("Highlander 2", 1);
    	queue.addMovie("Johnny Mnemomic", 1);
    	queue.addMovie("A Few Good Men", 3);
    	queue.addMovie("The Godfather Part II", 4);
    	queue.addMovie("Memento", 4);
    	queue.addMovie("Highlander 2", 1);
    	queue.addMovie("2001: A Space Odyssey", 4);

    	System.out.println(queue.toString());

    	queue.removeMovie("Highlander 2");

    	System.out.println(queue.toString());

    }
}
