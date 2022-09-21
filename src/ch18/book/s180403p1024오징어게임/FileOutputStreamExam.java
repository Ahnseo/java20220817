package ch18.book.s180403p1024오징어게임;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExam {
	public static void main(String[] args) throws Exception {
		//jfif파일 복사 하기
		String originalFileName =
				"C:\\Users\\user\\Desktop\\output\\\\오징어게임.jfif";
		String targetFileNmae ="C:\\Users\\user\\Desktop\\output\\오징어게임_복사본.jfif";
		
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileNmae);
		
		int readByteNo = 0;
		byte[] readBytes = new byte[100];
		
		while ((readByteNo =fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fis.close();
		fos.close();
	}
}
