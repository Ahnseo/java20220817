package ch04.book;

public class p118SwitchNobreakCaseExample {
	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8; // 8 <= time < 12
		System.out.println("[현재시간: " + time + "시]");

		switch (time) {
			case 8:
				System.out.println("출근 합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		} // case를 찾은후, break 를 만날때 까지 출력됨 
		  // 특정 time 이후의 스케줄을 알기위해 일부러 break 안쓴 것.
	}
}
