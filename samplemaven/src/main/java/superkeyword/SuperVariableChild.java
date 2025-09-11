package superkeyword;
//calling parent class variable
public class SuperVariableChild extends SuperVariable {
	String r="blue";
	public void display()
	{
	System.out.println(r+" "+super.r);	
	//System.out.println(super.r);
	}

	public static void main(String[] args) {
		
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();
	}

}
