package ch18.book.s180402p1022;

import java.io.InputStream;
import java.io.FileInputStream;

public class FileInputStreamExam {
	public static void main(String[] args) {
		String path = "src/ch18/book/s180402p1022/FileInputStream.java";
		try {
			InputStream is = new FileInputStream(path);
			
			int data = 0 ;
			while( (data = is.read() ) != -1) {
				System.out.write(data);
			}
			is.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
