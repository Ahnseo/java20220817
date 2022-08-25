package ch05.book;

public class p148StirngEqualsExample {
	public static void main(String[] args) {
		
		String str1 = "안서정";
		String str2 = "안서정";
		
		if(str1 == str2) {
			System.out.println("str1 과 str2 참조값이 같음");			
		}else
			System.out.println("str1 과 st2 참조값이 다름");			
		
		if(str1.equals(str2)) {
			System.out.println("str1 와 str2는 문자열이 같음");			
		}else
			System.out.println("str1 와 str2는 문자열이 다름");	
		
		String str4 = new String("안서정");  //새 인스턴스가 만들어지고~ str4 에 저장
		String str5 = new String("안서정");  //새 인스턴스가 만들어지고~ str5 에 저장
		
		if(str4 == str5) {
			System.out.println("str4 와 str5 참조값이 같음");
		}else
			System.out.println("str4 와 str5 참조값이 다름");
		
		if(str4.equals(str5)) {
			System.out.println("str4 와 str5는 문자열이 같음");
		}
		
		
	}
}
