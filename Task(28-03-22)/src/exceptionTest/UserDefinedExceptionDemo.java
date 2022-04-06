package exceptionTest;

public class UserDefinedExceptionDemo {

	public static void validate(int Age) throws UserDefinedException
	{
		if(Age>18)
		{
			System.out.println("Person Eligible to vote");
		}
		else
		{
			throw new UserDefinedException("Ineligible");
		}
	}
	
	public static void main(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		try
		{
		validate(15);
		}
		catch(UserDefinedException ude)
		{
			System.out.println(ude.toString());
		}
	}

}
