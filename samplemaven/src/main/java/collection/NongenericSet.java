package collection;

import java.util.HashSet;
import java.util.Set;

public class NongenericSet {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("blue");
		s.add(1);
		s.add('b');
		s.add(5.3);
		System.out.println(s);
		
		Set a=new HashSet();
		a.add("black");
		a.add(9);
		a.add('e');
		a.add(6.3);
		System.out.println(a);
		
		s.addAll(a);
		System.out.println(s);
		
	//contains
		System.out.println(a.contains("black"));
		
		//containsAll
		System.out.println(s.containsAll(a));
		
		
		//isEmplty
		System.out.println(a.isEmpty());
		
	    //remove
		a.remove(6.3);
		System.out.println(a);
		
		//removeAll
		System.out.println(s);
		s.removeAll(a);
		System.out.println(s);
		
		//size
		System.out.println(s.size());
		
		//clear
		a.clear();
		System.out.println(a); 
		
		
		

	}

}
