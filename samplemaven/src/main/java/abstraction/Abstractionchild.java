package abstraction;

public class Abstractionchild extends AbstractionParent{

	@Override
	public void display() {
		System.out.println("hiding method");
	}
public static void main(String args[])
{
	Abstractionchild obj=new Abstractionchild();
	obj.display();
	obj.print();
	
}
}
