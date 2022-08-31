package ch07.review.excersice.Ayong;


public class BindingTest {
	public static void main(String[] args) {
		Child child1 = new Child();

		
		Person person1 = new Child();  // Person class > Child class  이기떄문에 
										// person.x = 200?
		
		System.out.println(person1.x);
		
	}
}

	


	
	