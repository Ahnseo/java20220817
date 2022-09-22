package ch18.lecture.p7network;

import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) {
		//네트워크 기초
		
		//서버: 연결 기다림
		//연결 요청을 수락함
		//Socket 만들기 위해 ServerSorket 사용
		
		System.out.println("연결 기다림");

		try (
				//ServerSorket만들기 
				ServerSocket serverSocket = new ServerSocket(52000);
				//연결 기다림
				Socket socket = serverSocket.accept();
//				socket.close(); 항상 닫아주니 필요없음
//				serverSocket.close(); 항상 닫아주니 필요없음
				
				){
			
			System.out.println(socket.getRemoteSocketAddress());
			System.out.println("연결 종료");
			
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//                      cmd +(:포트번호)
		//   myServer =  172.30.1.51:52000
		
	}
}
