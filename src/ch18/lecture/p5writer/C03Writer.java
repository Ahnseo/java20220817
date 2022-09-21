package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.Writer;

public class C03Writer {
	public static void main(String[] args) throws Exception {
		String fileName ="C:\\Users\\user\\Desktop\\output\\output7.txt";
		Writer writer = new FileWriter(fileName);
		
		char[] charBuffer = {'a','b','c','d','가','나','다','라'};
		
//		int len = 0;
		
		writer.write(charBuffer, 0, 3);
	
		writer.write(charBuffer, 4, 2);
		
		writer.close();
		
	}
}
