import java.util.Scanner;

public class MultiplicationTableForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		
		int A = sc.nextInt();
		
		for(int i = 1; i<= 12; i++)
		{
			System.out.printf("%d * %d = %d \n",A,i,A*i);
		}
		

	}

}
