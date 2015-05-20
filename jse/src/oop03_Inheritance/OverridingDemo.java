package oop03_Inheritance;

/*
 * ��Ӱ��迡�� �θ𿡼� ����� �޼ҵ带 �ڽ��� �ٽ� �����ϴ� ���
 * �θ��� �޼ҵ�� ���õ�
 * ���� �޼ҵ尡 �θ�� �ڽ� ���� ��� ����Ǿ�����
 * ������ �ٸ��� �����Ͽ� ����� = Ŭ������ �������� ����
 * �θ�� �ڽİ��� �޼ҵ��� ���� (�޼ҵ��, �Ķ���� ����,�Ķ����Ÿ�� �̰��ƾ���)
 * �θ� �޼ҵ带 ������ֳ� �ڽ��� �ڽ��� ������ �޼ҵ带 �켱 �����.
 * �θ� �޼ҵ� ����� �����ϸ鼭 ��Ȳ�� ���� �ڽ��� ������ ����� ����ϰ� ���� ��쿡 ����ϸ� ������ ����
 * �θ��� �޼ҵ带 ĸ��ȭ�Ѵٰ� ���� �ִ�.
 * �θ��� ����ɴ� �������� ���� �ƴ϶� �����ϸ鼭 ���ο� ������� ��ü�Ϸ��� ����
 * �ڹٴ� �ظ��ϸ� ����� ���� �ʰ� �������̽��� ����Ѵ�.
 */

public class OverridingDemo {
	public static void main(String[] args) {
		// show()�� ������ �����Ƿ� �������̵�
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
	//	System.out.println("Child's show() ����");
	//}
	
	@Override           // ����� �����޾Ҵٴ� ������ �ƴ϶� !�θ��� �޼ҵ�!�� Ȯ���Ų �����̴�
	void show() {
		super.show();
		System.out.println("Child's show() ����");
	}
}
