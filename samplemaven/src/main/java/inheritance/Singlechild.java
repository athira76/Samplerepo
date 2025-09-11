package inheritance;

public class Singlechild extends Single {
	public void print()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		
		Singlechild obj=new Singlechild();
		obj.display();
		obj.print();
	}

}
