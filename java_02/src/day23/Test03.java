package day23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Test03 {
	public static void main(String[] args) {
		String fileName = "data.obj";
		FileOutputStream fos = null;
		ObjectOutputStream oss = null;
		
		try {
			fos = new FileOutputStream(fileName);
			oss = new ObjectOutputStream(fos);
			
			String name = "홍길동";
			Date d = new Date();
			oss.writeObject(name);
			oss.flush();
			oss.writeObject(d);
			oss.flush();
			System.out.println(" 파일 저장 완료.");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (oss != null) oss.close();
				if (fos != null) fos.close();
			}catch( Exception e2){
				e2.printStackTrace();
				
			}
		}
	}

}
