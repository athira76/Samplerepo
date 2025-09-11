package superkeyword;

public class SuperConstructorchild extends SuperConstructor {
  public SuperConstructorchild()
  {
	  super(2,3);
	  System.out.println("SuperConstructorchild");
  }

	public static void main(String[] args) {
		SuperConstructorchild obj=new SuperConstructorchild();
		

	}

}
