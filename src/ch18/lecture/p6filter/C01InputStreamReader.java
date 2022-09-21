//한글
package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C01InputStreamReader {
	public static void main(String[] args) throws Exception  {
		//InputStreamReader : InputStream -> ReaderStream 변환, 영어-> 한글로 변환하는 .. 종종 사용함
		String name = "src/ch18/lecture/p6filter/C01InputStreamReader.java"; //C01InputStreamReader.java 파일에 있는 맨밑에 메소드에 접근중..
		FileInputStream fis = getFileInputStream(name);
		Reader isr = new InputStreamReader(fis); //FileInputStream -> InputStreamReader
		
//		int c1 = fis.read();
//		int c2 = fis.read();
//		int c3 = fis.read();
//		int c4 = fis.read();
		
		int c1 = isr.read();
		int c2 = isr.read();
		int c3 = isr.read(); //한
		int c4 = isr.read(); //글
		System.out.println((char) c1);
		System.out.println((char) c2);
		System.out.println((char) c3);
		System.out.println((char) c4);
		
		fis.close();
		isr.close();
	}
	
	
	//C01InputStreamReader.java 파일에 있는 맨밑에 메소드에 접근중..
	//누군가 만들어 놓은 FileInputStream()메소드 변경 불가능 한 경우....
	private static FileInputStream getFileInputStream(String fileName) throws Exception{
		return new FileInputStream(fileName);
	}
	
}
