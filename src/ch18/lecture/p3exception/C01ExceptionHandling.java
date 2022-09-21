package ch18.lecture.p3exception;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01ExceptionHandling {
	//Exception핸들링
	public static void main(String[] args) throws Exception {
		
	String name = "C:\\Users\\user\\Desktop\\output\\output5";
	OutputStream os = new FileOutputStream(name);
	
	os.write(99);
	os.write(88);
	
	os.close(); 
//	throws Exception 사용은 안전하지않다.
	}
}
