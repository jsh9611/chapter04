package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("images.jpg");
			os = new FileOutputStream("images2.jpg");
			
			int data = -1;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch(IOException e) {
			System.out.println("error:" + e);
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}