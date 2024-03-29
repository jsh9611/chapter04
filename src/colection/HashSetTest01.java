package colection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();

		String s1 = new String("고길동");
		String s2 = new String("고길동");
		s.add(s1);
		s.add(s2); //내용이 같으면 넣지 않음.
		
		s.add("둘리");
		s.add("마이콜");
		
		System.out.println(s.contains(s2));
		System.out.println(s.size());
		System.out.println(s);
		
		String s3 = new String("고길동");
		s.remove(s3);
		System.out.println(s.size());
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
