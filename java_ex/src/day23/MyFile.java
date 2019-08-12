package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyFile {
	
	public synchronized static void save(String fileName, Object obj)  {
		FileOutputStream fos = null;
		ObjectOutputStream oss = null;
		
		try {
			fos = new FileOutputStream(fileName);
			oss = new ObjectOutputStream(fos);
			oss.writeObject(obj);
			oss.flush();
			System.out.println(obj +"객체가" + fileName + "file에 저장되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
		}finally {
			try {
				if(oss != null) oss.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
	}
	

	public static Object load(String fileName)  {
		FileInputStream fis = null ;
		ObjectInputStream ois = null ;
		Object data = null;
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			data = ois.readObject();
			System.out.println((fileName + "파일로부터" + data+"Load 완료"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
		return data;
  }
}
