import java.util.Scanner;

public class ForSameClass {
	static double radius;
	static final double PI =3.14;

	public double calculateArea(double radius)
	{
		return(Math.PI*radius*radius);
	}
	public double calculatePerimeter(double radius)
	{
		return(2*Math.PI*radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForSameClass circle = new ForSameClass();
		
		System.out.println("Enter the radius:");
		Scanner sc = new Scanner(System.in);
		 radius = sc.nextDouble();
		
	System.out.println("Area of Circle is: "+ circle.calculateArea(radius));
	System.out.println("Perimeter of Circle is: "+ circle.calculatePerimeter(radius));


	}

}
