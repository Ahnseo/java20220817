package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.Writer;

public class C02Writer {
	public static void main(String[] args) throws Exception {
		String fileName ="C:\\Users\\user\\Desktop\\output\\output6.txt";
		Writer writer = new FileWriter(fileName);
		
		writer.write("hello world");
		writer.write("!!!!!!!\n");  // \n : 한줄 띄우기
		writer.write("@@@\t@@@");   // \t : tap 만큼 띄어쓰기
		
		writer.close();
	}
}
