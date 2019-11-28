package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
		// 1. 기반스트림
		// 표준입력, stdin, System.in (JVM이 자동으로 만들어줌)
		
		// 2. 보조스트림01 ( |byte|byte|byte|... -> char)
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		
		// 3. 보조스트림02( |char|char|char|char|...|\n -> "charcharcharchar...")
		br = new BufferedReader(isr);
		
			String line = null;
			while((br.readLine()) != null); {
				if("exit".equals(line)) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}  finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
