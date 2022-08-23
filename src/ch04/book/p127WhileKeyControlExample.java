package ch04.book;

public class p127WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
						//main 메소드 끝에 throws Exception은 
						//system.in.raed()메소드에 대한 예외처리 코드이다.
		
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode !=13 && keycode !=10) {
				System.out.println("1.증속 2.감속 3.중지");
				System.out.println("선택");
			}
			
			keycode = System.in.read();
			
			if(keycode ==49 ) {
				speed++;
				System.out.println("현재속도 :"+ speed);
			}else if(keycode ==50) {
				speed--;
				System.out.println("현재속도 :"+ speed);
			}else if(keycode ==51){
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}
}
