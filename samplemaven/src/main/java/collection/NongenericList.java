package collection;

import java.util.ArrayList;
import java.util.List;

public class NongenericList {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("green");
		l.add(1);
		l.add('a');
		l.add(2.3);
		l.add('a');
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(1, 8);
		System.out.println(l);
		System.out.println(l.isEmpty());
		System.out.println(l.indexOf('a'));
		System.out.println(l.lastIndexOf('a'));
		l.remove(1);
		System.out.println(l);
		System.out.println(l.contains(2.3));
		System.out.println(l.size());
		
		

	}

}
