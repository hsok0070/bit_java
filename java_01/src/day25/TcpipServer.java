package day25;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TcpipServer  {
	public static void main(String[] args) {
		
		ServerSocket serversocket = null;
		List<BufferedWriter> clientlist = new ArrayList<BufferedWriter>();
		String line = "서버에 방문하신걸 환영합니다.";
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
				new ServerThread(socket,clientlist).start();
				
				//System.out.println(socket.getInetAddress()+"와 연결중");

//				String name = br.readLine();
//				bw.write("안녕하세요 "+ name + "\n");
//				bw.flush();
				} catch (Exception e) {
				e.printStackTrace();
				
			}finally {
			}

		}
		
		
	}
}

class ServerThread extends Thread{

	BufferedWriter bw = null;
	BufferedReader br = null;
	Socket socket = null;
	String name = null;
	List<BufferedWriter> clientlist = null;
	
	public ServerThread(Socket socket, List<BufferedWriter> clientlist) {
		this.socket = socket;
		this.clientlist = clientlist;
		
		try {
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));  
		
		clientlist.add(bw);
		
		name = br.readLine();
//		bw.write("안녕하세요 "+ name + "\n");
//		bw.flush();
		broadcast(" 님이 입장하셨습니다.");
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}

	@Override
	public void run() {
		String str = null;
		try {
		while((str = br.readLine()) != null) {
			broadcast(str);
			if (str.equals("q")) {
				broadcast("님이 퇴장하셨습니다.");
				clientlist.remove(bw);
			}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null)
					br.close();
				if (bw != null) {
					//clientlist.remove(bw);
					bw.close();
				}
				if (socket != null)
					socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		}
	
	private synchronized void broadcast(String str)  {
		clientlist.forEach(bw -> {
			try {
			bw.write(name+ " : " + str +"\n");
			bw.flush();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		});
		
	}
	}
	
	


