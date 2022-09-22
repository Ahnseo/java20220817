package ch18.book.exercise.p11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost" , 5001));
		
		System.out.println("서버 시작");
		
			try {
			
			Socket socket = serverSocket.accept();
			
			InputStream is = socket.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			//작성위치
			String path = "C:\\Users\\user\\Desktop\\output\\outputExam11.txt";
			FileOutputStream fos = new FileOutputStream(path);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] byteBuffer = new byte[100];
			is.read(byteBuffer);
			
			//작성위치
			int len = 0;
			String fileName = new String(byteBuffer);
			System.out.println(fileName); //이름을 출력하고싶은데?
			fileName = fileName.trim();
			
			System.out.println("[파일 받기 시작] " + fileName);
			while ((len = bis.read(byteBuffer)) != -1) {
				bos.write(byteBuffer, 0, len);
			}
				
			System.out.println("[파일 받기 완료] ");
			fos.close();
			bos.close();
			is.close();
			bis.close();
			socket.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			serverSocket.close();	
	}
		
		}
			
	

