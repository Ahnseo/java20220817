package ch02.leacture;

public class C06Double {
	public static void main(String[] args) {
		//실수 변수 : double(8byte) , float(4byte)
		//왠만하면 double 사용하자, 더 큰 범위, 더 정교한 표현가능
		//실수 literal 은 double 형
		
		double a = 3.14;
		double b = 0.13562635354531;
		
		float c = 3.14F;             //float 는 F 를 붙임
		float d = 0.13562635354531F; //float 는 F 를 붙임
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//주의사항
		//10진법을 2진법으로 옮길때, 근사갑으로 하기 때문에
		double f = 0.1; // 실제 저장은 2진법으로 되어있음
		System.out.println(f);
		
		double g = 0.2;
		
		double h = f + g;
		System.out.println(h); //0.3 x
		//0.30000000000000004 

	}
}
