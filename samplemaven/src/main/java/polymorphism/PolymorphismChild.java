package polymorphism;

public class PolymorphismChild extends PolyParent{
	public void display(int a ,int b)
	{
		super.display(5, 3);//parent class method overriding
		int sub=a-b;
		System.out.println(sub);
	}
	

	public static void main(String[] args) {
	
		PolymorphismChild obj=new PolymorphismChild();
		obj.display(8,2);
	}

}
