package ch18.lecture.p3exception;

import java.io.PrintWriter;
import java.util.Scanner;



public class C04ExceptionHandling {
	public static void main(String[] args) {

		// 생성시 check exception 처리하지 않아도 되고
		// 다시 할당하는 코드가 작성되지 않는다면(effectively final) 
		// try {코드블럭} 전에 선언 및 할당하고,
		// try () 변수명 나열할 수있음
		// 자바 9부터 사용가능
		
		final Scanner scanner = new Scanner(""); //Scanner < AutoCloseable
		final PrintWriter printWriter = new PrintWriter(System.out);
		
		try(scanner; printWriter;) {
			//일 함..
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
