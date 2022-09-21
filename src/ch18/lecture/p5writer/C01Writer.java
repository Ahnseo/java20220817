package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) throws Exception {
		
	//writer : 문자단위로 출력하는 스트림
	//주요 : write()
	String fileName = "C:\\Users\\user\\Desktop\\output\\output5.txt";
	Writer writer = new FileWriter(fileName);
	
	//write(int c) : 문자 하나 출력하는 메소드
	//Parameters: c int specifying a character to be written
	writer.write('a');
	writer.write('b');
	writer.write('한');
	writer.write(9742);
	
	writer.close();
	}
}
