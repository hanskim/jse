package oop05_polymorphism;

public class FruitMain {
	public static void main(String[] args) {
		// �������̽��� ��ü�� ���� �� ����.
		// FruitInterface f1 = new FruitInterface(); ���� �߻�
		FruitInterface apple = new AppleImpl();
		FruitInterface banana; // FruitInterfaceŸ���� �������� ����
		banana = new BananaImpl();// Ŭ���� BananaImpl �� ��ü�� �����Ͽ� banana�� �Ҵ�.
		FruitInterface orange = new OrangeImpl();
		apple.display("���ִ� ");
		banana.display("������ ");
		orange.display("��ŭ�� ");
		//orange.getcount() �������̽������� ����� �޼ҵ常 ȣ�� ����!!
	}
}
