package ch12.book.s1203p590;

public class PriorityExam {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread"+i);
			if (i !=10 ) {
				thread.setPriority(Thread.MIN_PRIORITY); //확률상 가장 낮은 순위로 설정
			}else {
				thread.setPriority(Thread.MAX_PRIORITY); //확률상 가장 높은 순위로 설정
			}
			thread.start();
			// 재실행으로 결과가 다를 수 있다는걸 확인하자.
		}
	}
}
