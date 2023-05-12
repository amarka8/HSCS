
public class TriangleTester {

    public static void main(String[] args) {
    
      Factorial f = new Factorial(5);
      System.out.println(f.findFactorial());
    	
		Triangle triangle = new Triangle(10);
		System.out.println(triangle.getArea());

		System.out.println(getArea(4));
      
		//System.out.println(getArea(4, 0));
    }
    
    public static int getArea(int width)
    {
    	if (width == 1) return width;
    	return width + getArea(width - 1);
    }
    
    public static int getAreaLoop(int width)
    {
      int area = 0;
      for (int i = width; i > 0; i--) {
         area += i;
      }
      return area;
    }
    
    public static int getArea(int width, int area)
    {
    	if (width == 0) return area;
    	return getArea(width - 1, width + area);
    }
}

