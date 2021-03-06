package oop04_Abstraction;

/*Date : 
 * Author ; 
 * Desc : 
 * 
 * 
 * 
 */

public class AbsDemo {
	public static void main(String[] args) {
		Sum01 sum01 = new Sum01();
		System.out.println(sum01.sum(10, 20));
		System.out.println(sum01.toString());

		Sum02 sum02 = new Sum02();
		System.out.println(sum02.sum(10, 20));
		System.out.println(sum02.toString());

	}
}

abstract class AbsSum {
	// 필수적으로 강제성이 있는 메소드
	public abstract String toString();

	public String sum(int i, int k) {
		int sum = i + k; // int 값이 자연스럽게 String으로 캐스팅 (toString 때문에)
		return "" + sum;
		// int 리턴을 String 변환값 주는 방법
	}
}

class Sum01 extends AbsSum { // 상속받은클래스는 반드시 위의 완성되는 않은 메소드를 implement 해야함

	@Override
	public String toString() {
		return "class Sum01 extends AbsSum ";

	}

}

class Sum02 extends AbsSum {

	@Override
	public String toString() {
		return "class Sum02 extends AbsSum ";
	}

}
