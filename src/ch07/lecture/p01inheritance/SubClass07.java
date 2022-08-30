package ch07.lecture.p01inheritance;

public class SubClass07 extends SuperClass07 {
	
	//부모클래스의 필드초기화는 꼭해야한다. 생성자의 역할: 필드초기화
	
	public SubClass07() {
		super(1);
//		super(); // 상위클래스 생성자 꼭~ 실행해야함. (안쓰면, 자동 삽입됨....)
		//다른 코드보다 먼저 넣어야 함 
		//서브 클래스의 인스턴스 필드 초기화 하는일
	}
	

}
