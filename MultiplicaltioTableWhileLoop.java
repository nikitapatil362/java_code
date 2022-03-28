import java.util.Scanner;

public class MultiplicaltioTableWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int A =sc.nextInt();
		 
		while(i<=10)
		{
			System.out.printf("%d * %d = %d \n", A,i,A*i);
			i++;
		}
	}

}
