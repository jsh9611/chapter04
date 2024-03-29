package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;
		
		try {
			in = new FileReader("123.txt");
			
			int count = 0;
			int data = -1;
			while((data = in.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			
			System.out.println("");
			System.out.println("count:" + count);
			System.out.println("=================================");
			
			is = new FileInputStream("123.txt");
			count = 0;
			while((data = is.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			System.out.println("");
			System.out.println("count:" + count);
			System.out.println("=================================");

			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}