import java.util.Scanner;

public class NoDividedByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try
		{
		System.out.println(num/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
		System.out.println("Enter the next value:");
		String sl=sc.next();
		try
		{
		int num1 = Integer.parseInt(sl);
		}
		catch(NumberFormatException nfe)
		{
			System.out.print(nfe);
		}
		int a[] = new int [5];
		a[7]=10;
	}

}
