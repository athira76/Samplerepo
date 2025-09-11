package inheritance;

public class ChildHeir2 extends ParentHeir {
	public void print()
	{
		System.out.println("child2");
	}

	public static void main(String[] args) {
		ChildHeir2 obj1=new ChildHeir2();
		obj1.display();
		obj1.print();

	}

}
