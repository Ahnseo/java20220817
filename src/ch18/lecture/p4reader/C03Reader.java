package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.Reader;

public class C03Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		
		Reader reader = new FileReader(fileName);
		int count = 0;
		
		while (reader.read() != -1) {
			count++;
		}
		System.out.println("총 " + count + "개의 문자로 작성됨");
		
		reader.close();
	}
}
