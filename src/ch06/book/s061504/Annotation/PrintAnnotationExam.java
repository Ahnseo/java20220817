package ch06.book.s061504.Annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExam {
	public static void main(String[] args) {
		// Service 클래스로 부터 메소드 정보를 얻음

		// Service 클래스에 선언된 메소드얻기(리플렉션)
		Method[] declaredMethods = Service.class.getMethods();

		// Method객체를 하나씩 처리
		for (Method method : declaredMethods) {
			// PrintAnnotation이 적용됐는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation 객체얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");

				// 구분선 출력
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}

				System.out.println();

				try {
					// 메소드호출
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}
}
