package ch18.book.exercise.p11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws Exception  {
		
		Socket socket = new Socket("localhost", 5001);
		
		OutputStream os = socket.getOutputStream(); //byte 단위로 보내려고함
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		String filePath ="C:\\Users\\user\\Desktop\\output\\오오오징어게임.jfif";
		File file = new File(filePath);
		
		String fileName = file.getName(); //fileName :오오오징어게임.jfif
		
		//작성위치
		byte[] byteBuffer = new byte[100];
		fileName = byteBuffer.getClass().getName();
		
		System.out.println("[파일 보내기 시작]"+ fileName);
		
		//작성위치
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int len = 0;
		while ((len = bis.read(byteBuffer)) != -1 ) {
			bos.write(byteBuffer, 0, len);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
