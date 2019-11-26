package colection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>(); //Stack<String> 생략가능
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
	
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		
		//s.pop(); // 스택은 비여있는 경우 StackException이 발생
	
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
	
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}

}
