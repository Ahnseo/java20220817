package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.Reader;

public class C04Reader {
	public static void main(String[] args) throws Exception {
		//"src/ch18/lecture/p4reader/C03Reader.java" : 총 443개의 문자로 작성됨
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		Reader reader = new FileReader(fileName);
		
		//read(char[]) : char 배열에 읽은 문자를 채우고 읽은 문자 갯수를 리턴
		
		char[] buffer = new char[100];
		
		int len1 = reader.read(buffer);
		int len2 = reader.read(buffer);
		int len3 = reader.read(buffer);
		int len4 = reader.read(buffer);
		int len5 = reader.read(buffer);//마지막에는 나머지 43개 읽고, 57개는 이전의 문자가 남아있다. 조심해서 사용하자.
		int len6 = reader.read(buffer);//더 이상 읽은 문자가 없으면 -1
		
		
		
		reader.close();
		
		
	}
}
