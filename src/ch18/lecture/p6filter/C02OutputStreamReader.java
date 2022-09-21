package ch18.lecture.p6filter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class C02OutputStreamReader {
	public static void main(String[] args) throws Exception  {
		String name = "C:\\Users\\user\\Desktop\\output\\output9.txt";
		
		FileOutputStream fos = getFileOutputStream(name);
		Writer wr = new OutputStreamWriter(fos);
		
//		fos.write('a');
//		fos.write('b');
//		fos.write('가');
//		fos.write('나');
		
		wr.write('a');
		wr.write('b');
		wr.write('가');
		wr.write('나');
		
		
		wr.close();
		fos.close();
		
	}
	//C02OutputStreamReader.java 파일에 있는 맨밑에 메소드에 접근중..
	//누군가 만들어 놓은 getFileOutputStream()메소드 변경 불가능 한 경우....
	private static FileOutputStream getFileOutputStream(String fileName) throws Exception {
		return new FileOutputStream(fileName);
	}
}
