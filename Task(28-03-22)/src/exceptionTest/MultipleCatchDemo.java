package exceptionTest;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		try
		{
			try 
			{
			a[2] =30/0;
			//a[8] =25;
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmenticException Occured");
			}
			try
			{
			String sl =null;
			System.out.println(sl.length());
			}
		
		catch(NullPointerException aob)
		{
			System.out.println("NullPointerException Occured");
		}
		}
		catch(
				Exception e)
		{
			System.out.println("ParentException Occured");
		}
		finally
		{
		System.out.println("Yaay!!!! Exceptions cleared");
		}
	}
}
