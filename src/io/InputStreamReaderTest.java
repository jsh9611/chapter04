package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		
		try {
			FileInputStream fis = new FileInputStream("ms949.txt");
			isr = new InputStreamReader(fis, "MS949");
			
			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (IOException e) {
			System.out.println("error : " + e);
		}

	}

}
