package ch18.lecture.p4reader;

import java.io.FileReader;

public class C05Reader {
	public static void main(String[] args) throws Exception {
		//"src/ch18/lecture/p4reader/C03Reader.java" : 총 443개의 문자로 작성됨
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		FileReader fileReader = new FileReader(fileName);
		
		char[] buffer = new char[100];
		int len = 0;
		int count =0;
		
		while ((len = fileReader.read(buffer)) != -1) {
			count++;
		}
		System.out.println("총 "+ count + "번 읽음");
		
		fileReader.close();
	}
}
