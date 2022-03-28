import java.util.Scanner;

public class FloatingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter floating-point number: ");
		float A = sc.nextFloat();
		
		System.out.println("Enter another floating-point number: ");
		float B = sc.nextFloat();
		
		A=Math.round(A*1000);
		A=A/1000;
		
		B=Math.round(B*1000);
		B=B/1000;
		
		if(A==B)
			
			System.out.println("There are the same up to three decimal places");
		
		else
			
			System.out.println("They are different");

	}

}

