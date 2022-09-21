package ch18.lecture.p2outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C04OutputStream {
	public static void main(String[] args) throws Exception {
		// 지금 이 파일을 (C04OutputStream.java)읽고 -> 출력(output4.txt)을 한꺼번에 
		String inFile = "src/ch18/lecture/p2outputStream/C04OutputStream.java";
		String outFile = "C:\\Users\\user\\Desktop\\output\\output4.txt";
		
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		
		byte[] b = new byte[10];
		int len =0;
		while ((len =fis.read(b)) != -1 ) {
			fos.write(b, 0, len);	
		}
		
		fis.close();
		fos.close();
	}
}
