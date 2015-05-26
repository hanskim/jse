package oop09_NestedClass;

public class InnerClassAnonyHello {

	interface GreetingService { // �������̽��� �⺯ �ʵ忡 ����
		public void greet(String name);
	}

	public void sayHello() {
		/*
		 * ����Ŭ���� �������̽� ������� 1
		 */
		class EnglishGreetingServiceImpl implements GreetingService {

			@Override
			public void greet(String name) {
				System.out.println("hello" + name);

			}
		}
		GreetingService eng = new EnglishGreetingServiceImpl();

		/*
		 * ����Ŭ���� �������̽� ������� 2 ( �� ����� ���� ��)
		 */
		GreetingService kor = new GreetingService() {

			@Override
			public void greet(String name) {
				System.out.println("�ȳ��ϼ���" + name);

			}
		};

		GreetingService jap = new GreetingService() {

			@Override
			public void greet(String name) {
				System.out.println("������" + name);

			}
		};

		eng.greet(" Tom");
		eng.greet(" ��");
		jap.greet(" �ùٻ�Ű��");
	}

	
	public static void main(String[] args) {
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();

	}
}
