package ch12.lecture;

public class C06공유객체사용금지 {
	//공유하는 객체의 상태변경
	//초보 수준에서는 상태를 변경하지말자.
	//결론: 스레드에서 공유하는 객체를 다루는 일은 굉장히 어려운 일이다.
	
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {0};
		Task7 t7 = new Task7();
		Task8 t8 = new Task8();
		t7.setArr(arr);
		t8.setArr(arr);
		
		Thread task1 = new Thread(t7);
		Thread task2 = new Thread(t8);
		
		task1.start();
		task2.start();
		
		task1.join();
		task2.join();
		System.out.println(arr[0]); //결과 값이..2_000_000 이 아닌데? 다른데?
		
	}
}

class Task7 implements Runnable{
	private int[] arr;
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1_000_000; i++) {
			arr[0]++;
		}
	}
	
}
class Task8 implements Runnable{
	private int[] arr;
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1_000_000; i++) {
			arr[0]++;
		}
	}
}
