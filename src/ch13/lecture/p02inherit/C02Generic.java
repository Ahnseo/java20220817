package ch13.lecture.p02inherit;

public class C02Generic {
	
}
//interface
interface Myinterface1<T>{
	
}
class MyClass5<T> implements Myinterface1<T> {
	
}
class MyClass6<T, U> implements Myinterface1<T> {
	
}
class MyClass7 implements Myinterface1<String> {//Myinterface1<String>명시 ,MyClass7명시할필요없어짐
	
}

