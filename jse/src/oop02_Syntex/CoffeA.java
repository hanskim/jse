package oop02_Syntex;

class Coffe {
	public Coffe() {
		System.out.println("���� ����");
	}

	public Coffe(int money) {
		System.out.println(money + "��");
	}

	public Coffe(int money, boolean exist) {
		System.out.println("���Ű��ɿ��� :" + (exist == true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}

}

public class CoffeA {
	public static void main(String[] args) {
		Coffe c1 = new Coffe();
		Coffe c2 = new Coffe(500);
		Coffe c3 = new Coffe(500, true);
	}

}
