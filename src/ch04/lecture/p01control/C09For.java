package ch04.lecture.p01control;

public class C09For {
	public static void main(String[] args) {
		
		// for문 중첩은 비효율적이니, 되도록 다른 방법으로 코드를 작성하자
		
		System.out.println("==========");
		System.out.println("==========");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("------");

		int k = 0; // k 변수 선언
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}

		System.out.println("------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int s = 5; s > i; s--) { // space 출력
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------");

		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------");
		
		int l = 0;
		for(int i =1; i <=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print( (l++)%10 );
			}
			System.out.println();	
		}
		System.out.println("------");
		
// 	https://school.programmers.co.kr/learn/courses/30/lessons/12969
//		코딩 연습. 직사각형 별만들기.
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();		
        
//        String line ="";
//        for(int i = 0; i < a; i++){
//            line += "*";
//        }
//        for(int i = 0; i < b; i++){
//            System.out.println(line);
//        }
	}
}
