package oop09_NestedClass;

public class InnerClassAnonyHello {

	interface GreetingService { // 인터페이스를 멤변 필드에 박음
		public void greet(String name);
	}

	public void sayHello() {
		/*
		 * 내부클래스 인터페이스 구현방법 1
		 */
		class EnglishGreetingServiceImpl implements GreetingService {

			@Override
			public void greet(String name) {
				System.out.println("hello" + name);

			}
		}
		GreetingService eng = new EnglishGreetingServiceImpl();

		/*
		 * 내부클래스 인터페이스 구현방법 2 ( 이 방법을 많이 씀)
		 */
		GreetingService kor = new GreetingService() {

			@Override
			public void greet(String name) {
				System.out.println("안녕하세요" + name);

			}
		};

		GreetingService jap = new GreetingService() {

			@Override
			public void greet(String name) {
				System.out.println("곤니찌와" + name);

			}
		};

		eng.greet(" Tom");
		eng.greet(" 톰");
		jap.greet(" 시바사키상");
	}

	
	public static void main(String[] args) {
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();

	}
}
