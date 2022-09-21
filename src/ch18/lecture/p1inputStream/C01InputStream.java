package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws Exception {
		
	// io패키지 에서는 
	// 결론적으로 InputStream , OutputStream , Reader, Writer  만 외우자
	
	//InputStream :프로그램기분으로 입력받는 객체를 만드는 클래스
	//입력단위 : byte
	
	//만만한 FileInputStream, 추상클래스이다.
	String path = "src/ch18/lecture/p1inputStream/C01InputStream.java";
	InputStream is = new FileInputStream(path);
	
	//주요메소드 read
	//read() : 1byte 읽기
	int r1 = is.read();
	int r2 = is.read();
	int r3 = is.read();
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	
	is.close(); //자원사용후 꼭 닫기
	
	}
}
