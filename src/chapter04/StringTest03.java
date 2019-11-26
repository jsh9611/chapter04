package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "aBcABCabcAbc";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 3));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));
		
		String s2 = "              ab        cd    ";
		String s3 = "efg,hijk,lmn,opq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		
		System.out.println("-----" + s2.trim() + "-----");
		System.out.println("-----" + s2.replaceAll(" ", "") + "-----");
		
		String[] tokens = s3.split(",");
		for(String str : tokens) {
			System.out.println(str);
		}
		
		
		// StringBuffer Test
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		sb.append(2020);
		
		System.out.println(sb.toString());
		System.out.println(sb);
		
		// String str = "Hello" + " " + "World" + 2020;
		String str = new StringBuffer("Hello")
						.append(" ")
						.append("World")
						.append(2020)
						.toString();
		System.out.println(str);

		// 주의 : '+' 연산자로 문자열(String)을 더할 때
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		for(int i = 0; i < 1000000; i++) {
			// str2 += i;	// => str2 = new StringBuffer(str2.append(i);
			sb2.append(i);
		}
		
		//format
		String name = "둘리";
		int score = 100;
		
		System.out.println(name + "님의 점수는" + score + " 입니다.");
		System.out.println(String.format("%s님의 점수는 %d입니다.", name, score));
		
	}

}
