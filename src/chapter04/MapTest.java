package chapter04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1); //Auto Boxing. 
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get("two"); //Auto Unboxing
		System.out.println(i);
		System.out.println(map);
		
		map.put("three", 333);
		System.out.println(map.get("three"));
		System.out.println(map);
		
		Set<String> s = map.keySet();
		for(String key : s) {

			int value = map.get(key);
			System.out.println(value);
		}
	}

}
