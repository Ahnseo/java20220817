package ch12.lecture;
/*멀티스레드를 잘 사용하면 프로그램적으로 좋은 성능을 낼 수 있지만,
멀티스레드 환경에서 반드시 고려해야할 점인 스레드간 동기화라는 문제는 꼭 해결해야합니다.

예를 들어, 스레드간 서로 공유하고 수정할 수 있는 data가 있는데 스레드간 동기화가 되지 않은 상태에서 
멀티스레드 프로그램을 돌리면, data의 안정성과 신뢰성을 보장할 수 없습니다.

따라서 data의 thread-safe 를 하기 위해 자바에서는 
synchronized 키워드를 제공해 스레드간 동기화를 시켜 data의 thread-safe를 가능케합니다.
 */ 
public class C07SynchronizedBlock {
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {0};
		Object lock = new Object();
		
		Thread t1 = new Thread(() ->{
			for (int i = 0; i < 1_000_000; i++) {
				//동기화블럭 (괄호안에 객채넣어)
				//객체획득->블럭실행->객체반납
				synchronized (lock) {
					arr[0]++;					
				}
			}
		});
		Thread t2 = new Thread(() ->{
			for (int i = 0; i < 1_000_000; i++) {
				synchronized (lock) {
					arr[0]++;					
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(arr[0]); //결과: 2000000
	}
}
