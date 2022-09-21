package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.Reader;

public class C01Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C01Reader.java";
		Reader reader = new FileReader(fileName);
		
		//주요 메소드 : read()
		//read() : 한 문자 읽고 int로 리턴
		int r1 = reader.read();
		int r2 = reader.read();
		
		System.out.println((char)r1);
		System.out.println((char)r2);
		
		reader.close();
	}
}
