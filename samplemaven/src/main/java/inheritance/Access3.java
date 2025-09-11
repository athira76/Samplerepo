package inheritance;

import accessmodifiers.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 obj=new Access1();
		obj.display();
		Access3 obj1=new Access3();
		obj1.display();
		obj1.display2();
		

	}

}
