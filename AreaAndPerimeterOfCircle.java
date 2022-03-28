import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		double radius =sc.nextInt();

		double area = Math.PI*radius*radius;
		double perimeter = 2*Math.PI*radius;
		
		System.out.println("Area of Circle is: "+ area);
		System.out.println("Perimeter of Circle is: "+ perimeter);
	}

}
