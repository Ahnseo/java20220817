package ch15컬렉션프레임워크.book.exercise.p9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		//HashMap에 아이디 와 점수가 저장
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
//		int totalScore = 0;
		
		//작성위치
		//평균 점수를 출력하고 최고점수value와 그 아이디 key를 출력
		
		int sum = 0;
		//keySet;
		Set<String> set = map.keySet();
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			int value = map.get(string);
			
			sum += value;
			
			if(value > maxScore) {
				maxScore = value;
				
				name = string;
			}
		}
		
		System.out.println(sum);
		System.out.println("평균"+ (double)sum /(map.size()));
		
		System.out.println(maxScore);
		System.out.println(name);
		
		
		System.out.println();
		
		
		
		
	}
}
