package ch04.lecture.p02method;

public class C10Return {
	public static void main(String[] args) {
		int a = max(3, 5);
		System.out.println(a);//5
		
		int b = max(5, 3);
		System.out.println(b);//5
		
		int c = max(-100, 100);
		System.out.println(c);// 100
		
		int d = max(100, 200);
		System.out.println(d);// 200
		
	}
//	둘중 큰값을 비교하여 출력하는 메소드 작성
	public static int max(int p1, int p2) {
		if(p1 > p2) {
			return p1;
		}else
			return p2;
	}

	// 힌트 단축키 : 오류인 빨간 밑줄에 커서를 놓고 ,  ctrl + 1 
	// 지금은 create method 를 힌트로 주었음.
//	private static int max(int i, int j) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
}
