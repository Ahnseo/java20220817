package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C02InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C02InputStream.java";
		InputStream is = new FileInputStream(path);
		
		//read : 한 바이트씩 읽음
		//더이상 읽을 바이트가 없으면 -1 리턴
		
		int count =0;
		while(is.read() != -1) {
			count++;
		}
		System.out.println(count);

		is.close(); //꼭해줘야함.
		
	}
}
