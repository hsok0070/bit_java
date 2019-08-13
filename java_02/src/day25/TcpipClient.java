package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpipClient extends Thread {
	public static void main(String[] args) {
		
	 String serverIP = "127.0.0.1";
	 BufferedReader br = null;
	 BufferedWriter bw = null;
	 Scanner keyboard = null;
	 Socket socket = null;
	 
		
		try {
			System.out.println(serverIP+ " 연결 시도");
			socket = new Socket(serverIP,8080); // server쪽으로 연결 
			System.out.println("server와 연결 완료.");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			new ClientThread(br).start();
			
			keyboard = new Scanner(System.in);
			System.out.println("ID를 입력해주세요.");
			bw.write(keyboard.nextLine()+"\n");
			bw.flush();
//			System.out.println(br.readLine());
			
			while(true) {
				System.out.println("메세지입력하세요.");
				String str = keyboard.nextLine();
				bw.write(str+"\n");
				bw.flush();
//				System.out.println(br.readLine());
				if(str.equals("q")) break;
			}
			
//		while(true) {	
//			System.out.println("메세지입력하세요...");
//			br = new BufferedReader(new InputStreamReader(System.in));
//			str = br.readLine();
//			System.out.println(str);
//			//str +=System.getProperty("line.separator"); // 문자열을 서버로 보내기전 한줄의 끝을 표시.
//			bw.write(str);
//			bw.flush();
//			if(str.equals("q")) break;
//		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(br != null) br.close();
			if(bw != null) bw.close();
			if(socket != null) socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
	
	class ClientThread extends Thread {
		
		BufferedReader br = null;
		
		public ClientThread(BufferedReader br) {
			this.br = br;
			
		}
		
		@Override
		public void run() {
			String str = null;
			
			try {
			while((str = br.readLine()) != null){	
				System.out.println(br.readLine());
			} 
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
		
