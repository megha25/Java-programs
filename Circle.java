
public class Circle {

	private int radius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Circle c1=new Circle();
      c1.calculateArea(5);
      c1.calculateArea(2.67);
	}
	private void calculateArea(double radius) {
		// TODO Auto-generated method stub
		double c_area;
		c_area=3.14 * radius * radius;
		System.out.println("Area of circle is " + c_area);
	}
	private void calculateArea(int radius) {
		// TODO Auto-generated method stub
		double area;
		area=3.14 * radius * radius;
		System.out.println("Area of circle is " + area);
	}

}
