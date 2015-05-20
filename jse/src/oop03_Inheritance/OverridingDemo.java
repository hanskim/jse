package oop03_Inheritance;

/*
 * 상속관계에서 부모에서 선언된 메소드를 자식이 다시 선언하는 경우
 * 부모의 메소드는 무시됨
 * 같은 메소드가 부모와 자식 에게 모두 선언되었으나
 * 내용을 다르게 정의하여 사용함 = 클래스의 다형성을 구현
 * 부모와 자식간에 메소드의 원형 (메소드명, 파라미터 갯수,파라미터타입 이같아야함)
 * 부모가 메소드를 상속해주나 자식은 자신이 구현한 메소드를 우선 사용함.
 * 부모가 메소드 기능을 유지하면서 상황에 따라 자식이 변형된 기능을 사용하고 싶은 경우에 사용하며 다형성 구현
 * 부모의 메소드를 캡슐화한다고 볼수 있다.
 * 부모의 구기능는 없어지는 것이 아니라 유지하면서 새로운 기능으로 교체하려는 목적
 * 자바는 왠만하면 상속을 쓰지 않고 인터페이스를 사용한다.
 */

public class OverridingDemo {
	public static void main(String[] args) {
		// show()는 원형이 같으므로 오버라이딩
		//ParentsB b = new ParentsB();
		//b.show();
		ChildC c = new ChildC();
		c.show();
	}
}
class ParentsB {
	void show() {
		System.out.println("Parents 's show()");
	}
	
	
}

class ChildC extends ParentsB {
	//void show() {
	//	System.out.println("Child's show() 수행");
	//}
	
	@Override           // 상속은 물려받았다는 개념이 아니라 !부모의 메소드!를 확장시킨 개념이다
	void show() {
		super.show();
		System.out.println("Child's show() 수행");
	}
}
