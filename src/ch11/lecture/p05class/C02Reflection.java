package ch11.lecture.p05class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C02Reflection {
	public static void main(String[] args) {
		Class c = String.class;
		//클래스클래스에 정보를 받아쓸수있지..
		
		System.out.println("필드 목록");
		Field[] fields = c.getFields();  //import java.lang.reflect.Field;
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		System.out.println();
		
		System.out.println("메소드 목록");
		Method[] methods = c.getMethods(); //import java.lang.reflect.Method;
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println();
		
		System.out.println("생성자 목록");
		Constructor[] constructors = c.getConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName());
		}
		
	}
}
