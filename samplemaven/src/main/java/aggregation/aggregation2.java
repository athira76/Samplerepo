package aggregation;

public class aggregation2 {
	String city, state;
	Aggregation1 ref;
	public aggregation2(String city,String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void  display() {
		System.out.println(ref.name+" "+ref.rollno);
		System.out.println("city :"+city+ " state :"+state);
	}
	

	public static void main(String[] args) {
		Aggregation1 obj1=new Aggregation1("athira",2);
		aggregation2 obj=new aggregation2("kottatyam","kerala",obj1);
		obj.display();

	}

}
