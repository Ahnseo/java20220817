package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C03InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C03InputStream.java";
		InputStream is = new FileInputStream(path);
		
		byte[] bytes = new byte[100];
		
		int length1 = is.read(bytes); 
		int length2 = is.read(bytes);
		int length3 = is.read(bytes);
		int length4 = is.read(bytes);
		int length5 = is.read(bytes);
		int length6 = is.read(bytes);
		int length7 = is.read(bytes);//100?
		int length8 = is.read(bytes);//100?
		
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);	
	
		System.out.println(length8);

		is.close();
		
		}
}
