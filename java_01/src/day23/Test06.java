package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream.GetField;
import java.util.Date;
import java.util.Set;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Test06  {
	public static void main(String[] args) {
		String fileName = "account.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			System.out.println(" account Object Read");
			Set<Account> a1 = (Set<Account>) ois.readObject();
			
			a1.forEach(i -> System.out.println(i));
			
			System.out.println("Read  "+a1);
			System.out.println(ois.readObject());

			
				
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if (ois != null) ois.close();
				if (fis != null) fis.close();
			}catch( Exception e2){
				e2.printStackTrace();
				
			}
		}
	}

}
