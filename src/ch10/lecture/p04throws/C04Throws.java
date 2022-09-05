package ch10.lecture.p04throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04Throws {
	public static void main(String[] args) throws FileNotFoundException {
		method1();
	}

	private static void method1() throws FileNotFoundException {
		//코드를 try/catch없이 컴파이되도록 수정해보기
		InputStream is = new FileInputStream("");
	}
	
}
