package chapter04;

public class MyObjectTest {

	public static void main(String[] args) {
		//MyObject myobject1 = new MyObject();
		MyObject myObject2 = MyObject.getInstance(); //Factory Method
		System.out.println(myObject2);

	}

}
