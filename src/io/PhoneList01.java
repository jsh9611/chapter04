package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		
		try {
			File file = new File("phone.txt");
			
			if(!file.exists()) {
				System.out.println("파일이 없습니다.");
				return;
			}
			
			System.out.println("==========파일정보==========");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(file.lastModified());
			System.out.println(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date(file.lastModified())) );
			
			System.out.println("==========전화번호==========");
			// 1. 기반 스트림
			FileInputStream fis = new FileInputStream(file);
			
			// 2. 보조스트림1
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			 //3. 보조 스트림2
			br = new BufferedReader(isr);
			
			//처리
			String line = null;
			while((line = br.readLine()) != null) {
				
				StringTokenizer st = new StringTokenizer(line, "\t");
				int index = 0;
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token);
					
					if(index == 0) {
						System.out.print(":");
					} else if(index == 1) {//전화번호1
						System.out.println("-");
					} else if(index == 2) {//전화번호2
						System.out.println("-");
					}
						
					index++;
				}
				
				System.out.println("");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			}  catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
