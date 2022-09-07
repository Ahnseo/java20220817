package ch11.lecture.p01object;



public class C07ToString {
	public static void main(String[] args) {
		Computer a = new Computer("LG", 32, 4, 300);
		Object b = new Computer("SamSung", 64, 8, 500);
		System.out.println(a.toString()); //객체의 스트링 표현
		
		System.out.println(b.toString());
		System.out.println(String.valueOf(b)); //String.valueOf(Object x) 적용중..
		System.out.println(b); //println(Object x) 적용중..  앞으로 이렇게 간단히 쓰면됨
	}
}

class Computer{
	private String model;
	private int ssd;
	private int ram;
	private int power;
	
	// *** 이클립스 source > Generate Construct ***
	public Computer(String model, int ssd, int ram, int power) {
		super();
		this.model = model;
		this.ssd = ssd;
		this.ram = ram;
		this.power = power;
	}
	//toString : 객체를 문자열(text)로 표현
//	@Override
//	public String toString() {
//		return "모델:"+model +","
//				+"ssd:" +ssd+","
//				+"ram:" +ram+","
//				+"power:"+power;	
//	}
	
	// *** 이클립스 source > Generate toString() ***
	@Override
	public String toString() {
		return "Computer [model=" + model + ", ssd=" + ssd + ", ram=" + ram + ", power=" + power + "]";
	}
	

	
}

