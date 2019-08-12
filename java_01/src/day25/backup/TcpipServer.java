package day25.backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TcpipServer implements Runnable {
	public static void main(String[] args) {
		
		ServerSocket serversocket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		String line = "서버에 방문하신걸 환영합니다.";
		TcpipClient c1 = new TcpipClient();
		try {
			serversocket = new ServerSocket(8080);
			System.out.println("서버가 준비 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} 
			
		while(true) {
			try {
				System.out.println("Client 요청 대기중");
				Socket socket = serversocket.accept(); // accept 대기상태
				Thread t1 = new Thread();

				//System.out.println(socket.getInetAddress()+"와 연결중");
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));  


				String name = br.readLine();
				System.out.println("안녕하세요."+ name + "\n");
				
				bw.write("안녕하세요 "+ name + "\n");
				bw.flush();
				
				
				String str = null;
				while((str = br.readLine()) != null) {
					bw.write(name+ " : " +str+"\n");
					bw.flush();
				}
								
				} catch (Exception e) {
				e.printStackTrace();
				
			}finally {
			}

		}
		
		
	}

	@Override
	public void run() {
		
	}

}
