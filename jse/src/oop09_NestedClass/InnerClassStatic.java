package oop09_NestedClass;

public class InnerClassStatic {
	int a = 20;
	private int b = 100;
	static int c = 200;

	public static class Inner {
		static int d = 1000;

		public void printData() {
			// System.out.println("�⺯ a" + a);
			// System.out.println("private b" + b);

			/*
			 * a�� b�� ������ ���� ���� static ���� Ŭ������ �� �̻� ����Ŭ���� �ƴ� �Ǵ� �ܺ�Ŭ������ ��ġ�� �ʰ�
			 * ���ٰ��� top level class��� �Ͽ� �ֻ��� Ŭ������ �� ��¿ �� ���� ����Ŭ������ static���� �����ؾ�
			 * �ϴ� ��� �ִ� �װ� �ٷ� ���� Ŭ������ ����� �� �ϳ��� static ����� ���� ��찡 �ִ�.
			 */

			System.out.println("statci c" + c);
			System.out.println("statci d" + d);
		}
	}
}
