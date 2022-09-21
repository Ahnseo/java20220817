package ch18.book.s180501p1030;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExam {
	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;  //InputStream : byte 단위로 입력
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] charBuffer = new char[100];
		while ((readCharNo = reader.read(charBuffer)) != -1) {
			String data = new String(charBuffer, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
	}
}
