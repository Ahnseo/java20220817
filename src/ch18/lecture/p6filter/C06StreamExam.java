package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class C06StreamExam {
	
	//3개의 스트림 연결해서 코드 작성
	//FilesInputStream -> InputStreamReader -> BufferedReader 
	public static void main(String[] args)  {
String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		
		try (
				InputStream is = new FileInputStream(name);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				) {
			String line = null;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
