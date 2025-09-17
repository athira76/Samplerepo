package encapsulation;

public class Encap1 {
	private String name;
	private int age;
	public  void setter(int age,String name)
	{
		this.name=name;
		this.age=age;
				}
	public void getter()
	{
		System.out.println("Name:" +name+" Age: "+age);
	}

}
