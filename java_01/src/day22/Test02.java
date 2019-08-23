package day22;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {

		String src = "c://lib/jjfr.gif" ;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		System.out.println("파일 복사중");
		
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c:/lib/copy.gif",true);
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.html"));
			int read = 0 ;
			int count = 0 ;
			
			while ((read = fis.read()) != -1) {
				fos.write(read);
						count++;
				
			}
			System.out.println("I/O 획수 : "+count);
			System.out.println("파일 복사 완료");
		
		} catch (FileNotFoundException e) {
			System.out.println(src+ " 파일 확인해 주세요.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			}catch (IOException e) {
				e.printStackTrace();
		}
		
		
		
		}

	}
}
