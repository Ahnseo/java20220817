package ch18.lecture.p2outputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C03OutputStream {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output3.txt";
		
		OutputStream os = new FileOutputStream(name);
		//write(byte[] b, int off, int len)
		// b: 쓸 데이터
		//off:배열 시작 위치
		//len:시작위치 부터 길이(몇개)
		
		byte[] b = new byte[100];
		os.write(b, 1, 3);//1번 인덱스 부터 ~3인덱스 , 3개(3byte)
		os.write(b, 0, 15);//0번 인덱스 부터~14인덱스 , 15개 (15byte)
		os.write(b, 50, 30);//50번 인덱스 부터~79인덱스 , 30개 (30byte)
		
		os.close();
		//C03OutputStreamFile.txt 는 총 48byte 
	}
}
