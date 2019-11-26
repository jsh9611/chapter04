package colection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
//리스트가 나오기 전 사람들이 쓰던 것
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");
//		v.add("");
//		v.addElement(obj); 없어보여
		
		//순회1
		int count = v.size();
		for(int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);		
		}
		v.removeElementAt(1);
		
//		for(String s : v) {
//			
//		}
		
		//순회2
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
