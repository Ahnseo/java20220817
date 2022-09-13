package ch13.book.excersice.p2;

public class p2ContainerExam {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int val = container2.get();
		System.out.println(val);
	}
}
