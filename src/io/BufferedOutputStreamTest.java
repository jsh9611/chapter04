package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			bos = new BufferedOutputStream(fos);
			for(int i = 'a'; i < 'z'; i++) {
			//for(int i = 97; i < 122; i++)
				bos.write(i);
			}
		} catch (IOException e) { //부모를 앞에다가 하면 안됨
			System.out.println("error : " + e);
		} finally {
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
//		catch (FileNotFoundException e) {
//			System.out.println("파이없음");
//		} 
		

	}

}
