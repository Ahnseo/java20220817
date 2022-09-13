package ch13.lecture.p05wildCard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("aa");
		list1.add("bb");
		
		// ? : unBounded WildCard
		//<?> add() 는 안되고, 모든지 꺼낼순있잖아? get()은 가능
		ArrayList<?> list2 = list1; // ok , <?> 어떤 타입이든 올수있다.
		list2.add("")//x ,어떤 타입이든 될수~ 있으니까 , 안된다...String를 안전하게 넣을수없다.
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(3);
		list3.add(6);
		ArrayList<?> list4 = list3;
		list4.add(9); //어떤 타입이든 될수~ 있으니까 , 안된다...Integer를 안전하게 넣을수없다.
		list4.add(new Object());// 이것도 안된다.
		
		Object o1 = list4.get(0); //모든지 꺼낼순있으니, get()은 가능
		
		//모든지 넣을순없나..?   ex) Number 클래스
		
	}
}
