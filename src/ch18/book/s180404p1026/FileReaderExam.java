package ch18.book.s180404p1026;

import java.io.FileReader;

public class FileReaderExam {
	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader(
				"src/ch18/book/s180404p1026/FileReaderExam.java");
		
		int readCharNo;
		char[] charBuffer = new char[100];
		
		while ((readCharNo=fileReader.read(charBuffer)) != -1) {
			String data = new String(charBuffer, 0, readCharNo);
			System.out.print(data);
			
		}
		fileReader.close();
	}
}
