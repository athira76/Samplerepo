package inheritance;

public class childHeir extends ParentHeir {
	public void print()
	{
		System.out.println("child1");
	}

	public static void main(String[] args) {
	    childHeir obj=new childHeir();
	    obj.display();
	    obj.print();

	}

}
