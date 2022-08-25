package ch05.book;

public class p157ArratCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3]; //arr1 저장공간 3개 생성
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+ i +"] = " + arr1[i]);			
		}
		
		System.out.println(); //줄 띄움
		
		// 값을 지정해보자
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+ i +"] = " + arr1[i]);
		}

		System.out.println(); //줄 띄움
		
		double[] arr2 = new double[3];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+ i +"] = " + arr2[i]);
		}

		System.out.println(); //줄 띄움
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+ i +"] = " + arr2[i]);
		}

		System.out.println(); //줄 띄움
		
		String[] arr3 = new String[3];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3["+ i +"] = " + arr3[i]);
		}

		System.out.println(); //줄 띄움
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3["+ i +"] = " + arr3[i]);
		}		
	}
}
