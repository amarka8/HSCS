import java.util.ArrayList;

public class TowersOfHanoi {

	private int numberOfDisks;
	private int numberOfMoves;
	private ArrayList<Integer> tower1;
	private ArrayList<Integer> tower2;
	private ArrayList<Integer> tower3;

	public TowersOfHanoi(int numberOfDisks)
	{
		this.numberOfDisks = numberOfDisks;
		tower1 = new ArrayList<Integer>();
		tower2 = new ArrayList<Integer>();
		tower3 = new ArrayList<Integer>();
		//sourceForThisPeg = tower1;
		for (int d = this.numberOfDisks; d > 0; d--)
		{
			tower1.add(d);
		}
	}

	public void play()
	{
		display();
		//play(numberOfDisks, 1, 3);
		play(numberOfDisks, tower1, tower2, tower3);
		System.out.println("Number of moves: " + numberOfMoves);
	}

	//private ArrayList<Integer> sourceForThisPeg;

	public void play(int n, ArrayList<Integer> source, ArrayList<Integer> storage, ArrayList<Integer> destination)
	{
		if (n != 0)
		{
			play(n - 1, source, destination, storage);
			move(source, destination);
			play(n - 1, storage, source, destination);
		}
	}

	private void move(ArrayList<Integer> source, ArrayList<Integer> destination)
	{
		destination.add(source.remove(source.size() - 1));
		//source.remove(source.get(source.size() - 1));
		numberOfMoves++;
		display();
	}

	private void display()
	{
		System.out.println(this.toString());
	}

	public String toString()
	{
		String r = "Peg 1: ";
		for (Integer i : tower1)
		{
			r += i.toString() + " ";
		}
		r += "\n";
		r += "Peg 2: ";
		for (Integer i : tower2)
		{
			r += i.toString() + " ";
		}
		r += "\n";
		r += "Peg 3: ";
		for (Integer i : tower3)
		{
			r += i.toString() + " ";
		}
		r += "\n";
		return r;
	}

}
