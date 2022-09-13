package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C03ArrayList {	
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		arr1.add(3);
		
		Object o1 = arr1.get(0);
		if( o1 instanceof Integer) {//위험한 코드이니
			int v1 = (int) arr1.get(0); //arr1[0]  강제 형변환해서 꺼내야 ...? Object > integer			
			System.out.println(v1); //arr1[0] 값 꺼내기
		}
		
		//다음으로  <> 사용을 배울것, 제네릭 타입.
		//타입파라미터를 맨나중에 설정하는 방법임
		
	}
}
