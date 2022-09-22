package ch18.book.s180504p1040PrintStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExam {
	public static void main(String[] args) {
		
		try(
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\output\\PrintStreamExam.txt");
				PrintStream ps = new PrintStream(fos);
				
				) {
			
			ps.println("[프린터 보조 스트림]");
			ps.print("마치 ");
			ps.println("프린터가 출력하는 것처럼");
			ps.println("데이터를 출력합니다.");
			
			ps.flush();
			fos.close();
			ps.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
