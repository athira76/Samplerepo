package inheritance;

public class ChildMultilevel extends ParentMultilevl {
	public void childprint()
	{
	System.out.println("child Print");
	}

	public static void main(String[] args) {
		ChildMultilevel obj=new ChildMultilevel();
		obj.dispaly();
		obj.print();
		obj.childprint();
		
		

	}

}
