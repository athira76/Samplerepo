package exceptionhandling;

public class Throwexample {

	public static void main(String[] args) {
		int age=16;
		if(age>18) {
			System.out.println("eligible");
		}
		else
		{
			throw new NumberFormatException("age under18");
		}

	}

}
