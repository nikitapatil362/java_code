import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first no.");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.println("Enter second no.");
		int B = sc.nextInt();
		System.out.println("Enter third no.");
		int C = sc.nextInt();
		
		if(A >=B && A >=C)
			System.out.println(A + " is the largest number.");
		else if(B >=A && B >=C)
			System.out.println(B + " is the largest number.");
		else
			System.out.println(C + " is the largest number.");	
	}

	
}
