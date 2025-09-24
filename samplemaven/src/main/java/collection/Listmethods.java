package collection;

import java.util.ArrayList;
import java.util.List;

public class Listmethods {

	public static void main(String[] args) {
		List <String> s=new ArrayList<String>();
		
		s.add("blue");
		s.add("red");
		s.add("blue");
		s.add("green");
		System.out.println(s);
		String a=s.get(1);
		System.out.println(a);
		s.set(1, "white");
		System.out.println(s);
		System.out.println(s.indexOf("blue"));
		System.out.println(s.lastIndexOf("blue"));
		s.remove(0);
		System.out.println(s);
		//contains
		System.out.println(s.contains("blue"));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		
		
		List <Integer> s1=new ArrayList<Integer>();
		s1.add(0);
		s1.add(2);
		s1.add(1);
		s1.remove(1);
		System.out.println(s1);
		
	}

}
