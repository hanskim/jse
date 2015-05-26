package oop09_NestedClass;

/* 내부클래스의 2번째 형태  ; 
 로컬 내부 클래스에서는 외부 클래스의 멤버를 접근하는데 제한이 따름.
 외부클래스의 멤버변수는 접근할 수 있지만 메소드 내부의 지역변수는 접근할 수 없다.
 지역변수에 중요한 내부정부가 있을 때 이런 방식 사용
 */

public class InnerClassLocal {
	int a = 100;

	public void innerTest(int k) {
		int b = 200;
		final int c = k;

		class Inner {                 // 아버지가 메소드니까 로컬변수이다.
			public void getData() {
				System.out.println("멤버변수 a " + a);
				System.out.println("상수 c " + c);
				// System.out.println("지역변수 b " + b);
				// Cannot refer to the non-final local variable b defined in an
				// enclosing scope
			}
		}

		Inner inn = new Inner();
		inn.getData();
	}

}
