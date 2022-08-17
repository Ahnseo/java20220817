package ch02.leacture;

public class C04Interger {
	public static void main(String[] args) {
		//정수 : byte(1byte), short(2btye), int(4byte), long(8byte)
		//1byte : 8bit (0000 0000) , 0 ~ 255 ,
		//-128 ~ 0 ~ 127 , 
		
//		byte(1byte)
//		-128 ~ 0 ~ 127
		byte a = 0;
		byte b = 127;
		byte c = -128;
//		byte d = 128; //x
//		byte e = -129; //x
		
//		short(2byte)
//		-32,768 ~ 32,767
		
		short f = -32768;
		short g = 32767;
//		short h = -32769;
//		short i = 32768;
		
//		int(4byte)
		int j = 2147483647;
		int k = -2147483648;
//		int l = -2147483649;
//		int m = 2147483648;
		
//		long(8byte)
//		매우 큰 값
		long o = 3000000000L;
		long p = -3000000000L;
		
//		정수 literal 작성시 주의 할 점
//		정수 literal은 int 취급
//		범위를 넘어갈땐 long타입표시 (대문자 L)
//		적성하는 수가 클 땐 _ 와 조합가능
		long q = 30_000_000_000L;
		
//		연산시 overflow주의
		int s = 2147483647;
		int t = s + 1 ; //2147483648 x
		System.out.println(t);
		
		
					
	}
}
