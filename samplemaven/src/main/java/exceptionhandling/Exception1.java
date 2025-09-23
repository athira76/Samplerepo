package exceptionhandling;

public class Exception1 {
	public static void main(String args[])
	{
	int a=10,b=0;
	try {
int sum =a/b;
	}
	finally {
		b=4;
		int c=a/b;
		System.out.println(c);
		
	}
	/*catch(ArithmeticException e) {
		b=4;
		int c=a/b;
		System.out.println(c);
		System.out.println(e);
	}*/
	

}
}