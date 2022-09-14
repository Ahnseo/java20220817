package ch12.lecture;

public class C05ThreadName {
	public static void main(String[] args) {
		Thread thread1 = new Task5();
		Thread thread2 = new Task5();
		//같은 일을 하는 다른객체. 거이 동시에 실행되는중.
		//어떤이름을갖은 객체가 실행되었는지 알고싶을때, getName(), 의미있는 이름을 짓고싶을땐, setName()
		thread1.setName("스레드1번");
		thread2.setName("스레드2번");
		
		// 근데, 왜 출력을 번갈아 할까 ?
		//출력하는 공간이 하나이기때문에, 서로 자리차지 하려고해서
		//스레드 우선순위를 작성해줄수는 있다. (CPU 점유율)		
		thread1.setPriority(10);//확률상 가장 높은 순위로 지정
		thread2.setPriority(1);//확률상 가장 낮은 순위로 지정
		
		thread1.start();
		thread2.start();
	}
}

class Task5 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 100000; i++) {
			System.out.println(getName() +" : "+ i);
		}
	}
}
