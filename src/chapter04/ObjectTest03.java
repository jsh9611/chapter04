package chapter04;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest03 {

	public static void main(String[] args) {
		Set<Rect> set = new HashSet<>();  // 자바 유틸
		
		Rect r1 = new Rect(10, 20);
		System.out.println(r1);
		set.add(r1);
		
		Rect r2 = new Rect(10, 20);
		System.out.println(r1.equals(r2));
		set.add(r2);
		
		System.out.println(set.size());
		System.out.println(set);
		
		
	}

}
