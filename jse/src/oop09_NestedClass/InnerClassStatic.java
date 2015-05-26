package oop09_NestedClass;

public class InnerClassStatic {
	int a = 20;
	private int b = 100;
	static int c = 200;

	public static class Inner {
		static int d = 1000;

		public void printData() {
			// System.out.println("멤변 a" + a);
			// System.out.println("private b" + b);

			/*
			 * a와 b가 에러가 나는 이유 static 내부 클래스는 더 이상 내부클래스 아님 또는 외부클래스를 거치지 않고도
			 * 접근가능 top level class라고 하여 최상위 클래스라 함 어쩔 수 없이 내부클래스를 static으로 선언해야
			 * 하는 경우 있다 그건 바로 내부 클래스의 멤버들 중 하나라도 static 멤버가 잇을 경우가 있다.
			 */

			System.out.println("statci c" + c);
			System.out.println("statci d" + d);
		}
	}
}
