package ch18.book.s180405p1027;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExam {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\user\\Desktop\\output\\file.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		
		fileWriter.write("FileWriter는 한글로 된 "+ "\n");
		fileWriter.write("문자열을 바로 출력할 수있다."+ "\n");
		
		fileWriter.flush();
		fileWriter.close();
		
		System.out.println("파일이 저장 되었습니다.");
		
		
	}
}
