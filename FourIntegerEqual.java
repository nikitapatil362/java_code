import java.util.Scanner;

public class FourIntegerEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter first numbers: ");
		int N1 =sc.nextInt();
		
		System.out.println("Enter second numbers: ");
		int N2 =sc.nextInt();
		
		System.out.println("Enter third numbers: ");
		int N3 =sc.nextInt();
		
		System.out.println("Enter fourth numbers: ");
		int N4 =sc.nextInt();
		
		if ( N1==N2 && N2==N3 && N3==N4 )
		{
			System.out.println("Number are equal");
		}
		else
		{
			System.out.println("Number are not Equal");
		}
	}

}
