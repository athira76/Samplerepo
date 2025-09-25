package collection;

import java.util.HashSet;
import java.util.Set;

public class Setmethods {

	public static void main(String[] args) {
		Set <String>s=new HashSet <String>();
		//add method
		s.add("blue");
		s.add("green");
		s.add("white");
		s.add("blue");
		System.out.println(s);
		
		//addAll method
		Set <String>s1=new HashSet <String>();
		s1.add("white");
		s1.add("red");
		s1.add("yellow");
		
		s.addAll(s1);
		System.out.println(s);
		
		//contains
		System.out.println(s1.contains("white"));
		
		//containsAll
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		
		//isEmplty
		System.out.println(s1.isEmpty());
		
		//remove
		s1.remove("white");
		System.out.println(s1);
		
		//removeAll
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		
		//size
		System.out.println(s.size());
		
		//clear
		s1.clear();
		System.out.println(s1);
		
		
		
		

	}

}
