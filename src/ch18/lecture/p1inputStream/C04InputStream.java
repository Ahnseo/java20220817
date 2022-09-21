package ch18.lecture.p1inputStream;

import java.io.FileInputStream;

public class C04InputStream {
	public static void main(String[] args) throws Exception {
		
		String path = "src/ch18/lecture/p1inputStream/C04InputStream.java";
		FileInputStream fis = new FileInputStream(path);
		
		//buffer 사전적용어 : 컴퓨터가 임시 저장(기록)
		byte[] buffer = new byte[10];
		int count =0;
		while ( (fis.read(buffer)) != -1 ) {
			count++;
		}
		System.out.println(count+"번 읽음");
		fis.close();
	}
}
