package ch05.lecture.p02reference;

public class C04Reference {
	public static void main(String[] args) {
		int a = 3; 
		printVar(a); // a값을 파라미터int p1에 넘겨줌 ->return  ->printVar(a) =3
		
		int b = 5;
		printVar (b);
		
		int[] c = {9 ,1 ,2}; //c의 참조값 {9,1,2}을 파라미터int[] p2에 넘겨줌 ->return  ->printVar(c)  =9
		printArray(c);
		
		int[] d = {99 ,88 ,77};//debug F6 F5로 실행순서 확인할 수 있음
		printArray(d);
	}

	private static void printArray(int[] p2) {
		System.out.println(p2[0]);
	}

	private static void printVar(int p1) {
		System.out.println(p1);	
	}
}
