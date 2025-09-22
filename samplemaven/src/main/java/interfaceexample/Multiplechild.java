package interfaceexample;

public class Multiplechild implements MultipleparentA,MultipleparentB {
	public void show()
	{
		System.out.println("interface child");
	}

	public static void main(String[] args) {
		Multiplechild obj=new Multiplechild();
		
		obj.print();
		obj.display();
		obj.show();

	}

	@Override
	public void print() {
		System.out.println("parent1");
		
	}

	@Override
	public void display() {
		System.out.println("parent2");
		
	}

}
