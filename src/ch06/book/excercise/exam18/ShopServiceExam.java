package ch06.book.excercise.exam18;

public class ShopServiceExam {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 ==obj2) {
			System.out.println("obj1 ==obj2");
		}else {
			System.out.println("obj1 !=obj2");
		}
	}
}
