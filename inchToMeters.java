import java.util.Scanner;

public class inchToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Give an input value in inch ");
Scanner sc = new Scanner(System.in);
float A =sc.nextFloat();
float meter =(float) (A*0.0254);
System.out.println(A +" inch is " +meter+ " meters");
	}

}
