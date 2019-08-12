package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.naming.LimitExceededException;

public class Test05 {
	public static void main(String[] args) {

		String src = "c://lib/jjfr.gif" ;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		System.out.println("파일 복사중");
		
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c:/lib/copy6.gif",true);
					
			int read = 0 ;
			int count = 0 ;
			
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while((read = bis.read()) != -1) {
				bos.write(read);
			}
			bos.flush();
//			byte[] buffer = new byte[1024*1024];
//			
//			
//			
//			while ((read = fis.read(buffer)) != -1) {
//				System.out.println("read :"+read);
//				fos.write(buffer,0,read);
//						count++;
//				
//			}
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
