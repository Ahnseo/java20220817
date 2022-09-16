package ch15컬렉션프레임워크.book.s150402p747;

import java.util.Map;
import java.util.Scanner;



public class Hashtable {
	public static void main(String[] args) {
		Map<String, String> map = new java.util.Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("id 와 password 를 입력하세요");
			System.out.print("id :");
			String id = scanner.nextLine();
			
			System.out.print("password :");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.containsKey(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else{
					System.out.println("비밀번호가 일치하지 않습니다.");
				}	
				
			}else {
				System.out.println("id가 존재하지 않습니다.");
			}

		}
	}
}
