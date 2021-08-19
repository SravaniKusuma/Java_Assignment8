class InvalidAge extends Exception
{
	InvalidAge(String s)
	{
		super(s);
	}
}
class InvalidAadhar extends Exception
{
	InvalidAadhar(String s)
	{
		super(s);
	}
}
class InvalidPAN extends Exception
{
	InvalidPAN(String s)
	{
		super(s);
	}
}
class ExceptionHandling
{
	void check(int age, String aadharNumber, String panNumber)throws InvalidAge, InvalidAadhar,InvalidPAN
	{
		if(age<18)
			throw new InvalidAge("The person is not eligible to vote");
		if(aadharNumber.length()!=12)
			throw new InvalidAadhar("The aadhar number is not correct");
		if(panNumber.length()!=10)
			throw new InvalidPAN("The PAN Number is invalid");
	}
}
public class MainClass{

	public static void main(String[] args) {
		
		try
		{
			 ExceptionHandling obj = new  ExceptionHandling();
			obj.check(16, "123456789101", "1234567890");
		}
		catch(InvalidAge | InvalidAadhar |InvalidPAN e )
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("The finally block is always executed");
		}

	}

}
