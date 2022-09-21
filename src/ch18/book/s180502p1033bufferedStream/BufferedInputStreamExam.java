package ch18.book.s180502p1033bufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamExam {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:/Users/user/Desktop/output/output11.txt");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		
		System.out.println("BufferedInputStream 미사용할 때 걸린 시간 : " + (end - start) + "ms");
		fis1.close();
		
		
		FileInputStream fis2 = new FileInputStream("C:/Users/user/Desktop/output/output11.txt");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		
		System.out.println("BufferedInputStream 사용할 때 걸린 시간: " + (end - start) + "ms");
		fis2.close();
		bis.close();
		
	}
}
