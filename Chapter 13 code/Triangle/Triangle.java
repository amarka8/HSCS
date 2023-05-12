
// deal the simplest instance of the problem
// break into a simpler instance and call the recursion
// combine the simpler solution into the current one

public class Triangle {

	private int width;

	public Triangle(int width)
	{
		this.width = width;
	}

	public int getArea()
	{
		if (width == 1) {return 1;} // deal with smallest instance
		Triangle smallerTriangle = new Triangle(width - 1); // make next smallest instance
		int smallerArea = smallerTriangle.getArea(); // call recursion
		return smallerArea + width; // combine simpler solution with current one
	}

}