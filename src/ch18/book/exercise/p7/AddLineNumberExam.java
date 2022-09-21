package ch18.book.exercise.p7;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExam {
	//정확한 경로로 수정하세요.
	public static void main(String[] args) throws Exception {
		
	String filePath =
			"src/ch18/lecture/p6filter/C03BufferedOutputStream.java";
	
	//작성위치
	
	FileReader fr = new FileReader(filePath);
	BufferedReader br = new BufferedReader(fr);
	
	int num = 1;
	String line = null;
	
	while( (line = br.readLine()) != null) {
		System.out.println(num + " : " + line);
		num ++;
	}
	
	fr.close();
	br.close();
	}
}	
