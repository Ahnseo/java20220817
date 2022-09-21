package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C03ExceptionHandling {
	public static void main(String[] args) {
		//try - with - resources(java 7부터 가능)
		//try - with - resources 와 사용가능한 타입은 AutoCloseable 만 가능
		
		try(
			//(괄호안에) 선언된 자원은 자동으로 닫아줌	
			InputStream is = new FileInputStream("");
			OutputStream os = new FileOutputStream("");
				) {
			//{중괄호안에} 읽고 쓰는 작업	
//			os = new FileOutputStream("");// 위에 선언되었다면, 다시 할당할수없음
			is.read();
			os.write(3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
