package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set <String> s=new HashSet<String> ();
	s.add("red");
	s.add("white");
	s.add("blue");
	System.out.println(s);
	//iterator interface
	Iterator it=s.iterator();//iterator method
	//print one by one
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	it.remove();//remove last element
	System.out.println(s);
	}

}
