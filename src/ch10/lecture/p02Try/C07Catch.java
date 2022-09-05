package ch10.lecture.p02Try;

public class C07Catch {
	public static void main(String[] args) {
		
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
			
			//하위 타입 부터 순서대로 catch 블록 작성
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong format");
		}catch (Exception e) {
			System.out.println("wrong index");
		}
	}

}