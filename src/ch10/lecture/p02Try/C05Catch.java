package ch10.lecture.p02Try;

public class C05Catch {
	public static void main(String[] args) {
		String[] arr = {"100","200","삼백"}; 
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a * 2);
			
		//catch 여러개 작성가능
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 잘 못 작성");
		}catch (NumberFormatException e) {
			System.out.println("수의 형식이 잘 못됨");
		}
		System.out.println("실행흐름 이어감");
	}		
}
