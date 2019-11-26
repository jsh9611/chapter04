package chapter04;

public class MyObject {

	private MyObject() {
		
		
	}
	public static MyObject getInstance() {
		return new MyObject();
	}
	

}
