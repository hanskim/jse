package oop05_polymorphism;

public class FruitMain {
	public static void main(String[] args) {
		// 인터페이스는 객체를 만들 수 없다.
		// FruitInterface f1 = new FruitInterface(); 에러 발생
		FruitInterface apple = new AppleImpl();
		FruitInterface banana; // FruitInterface타입의 참조변수 선언
		banana = new BananaImpl();// 클래스 BananaImpl 의 객체를 생성하여 banana에 할당.
		FruitInterface orange = new OrangeImpl();
		apple.display("맛있는 ");
		banana.display("오랜된 ");
		orange.display("상큼한 ");
		//orange.getcount() 인터페이스에서만 선언된 메소드만 호출 가능!!
	}
}
