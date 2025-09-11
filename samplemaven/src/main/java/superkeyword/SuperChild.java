package superkeyword;
//calling parent class method
public class SuperChild extends SuperMethod {
	public void print()
	{
		super.display();
		System.out.println("SuperMethodChild");
		
	}

	public static void main(String[] args) {
		
		SuperChild obj=new SuperChild();
		obj.print();
		
	}

}
