package ch03.lecture.p1binary;

public class C02IncrementDecrement {
	public static void main(String[] args) {
		//증가 연산자 : ++
		//감소 연산자 : --
		
		int i = 10;
		int j = 10;
		
		++i; // i에 1 더해서 다시 할당, 결과는 11
		System.out.println(i);
		
		j++; // 처음 j 값부터 할당,  결과는 10
		System.out.println(j);
		
		int m = 10;
		int n = 10;
		
		int o = --m; // -1 한후 다시할당 , 결과는 9
		int p = n--; // 처음값을 할당 후 -1. 결과는 10
		
		
		
	}
}
