import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=0,s=0;
		int avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 5 numbers: ");
		
		
		for (i=0;i<5;i++)
		{	
			n = sc.nextInt();
			
			s +=n;
		}
			avg =s/5;
				System.out.println("The sum of 5 numbers is:" +s
						+ "\nThe average is:"+avg);
		

	}

}
