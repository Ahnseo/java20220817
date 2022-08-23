package ch04.book;

public class p133ContinueExample {
	public static void main(String[] args) {
		for(int i =0 ; i <=10; i++) {
			if(i%2 != 0) { //2의 배수가 아니라면,
				continue; //continue 하겠다.
			}
			System.out.println(i);
		}
	}
}
