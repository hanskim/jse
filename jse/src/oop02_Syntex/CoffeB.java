package oop02_Syntex;

class MilkCoffe{
	int money ;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;              // ���⼺�� this �� �⺯  
	}

	public MilkCoffe() {
		System.out.println("���� ����");
	}

	public MilkCoffe(int money) {
		this();                            // ���⼭�� �޼ҵ�
		System.out.println(money + "��");
	}

	public MilkCoffe(int money, boolean exist) {
		this(money);
		System.out.println("���Ű��ɿ��� :" + (exist == true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}
}

public class CoffeB {
	public static void main(String[] args) {
		
	/*
	 * ���� �ִ�
	 * 500��
	 * ���Ű��ɿ���  : Ŀ����������
	 */
	
	MilkCoffe milkCoffe =new MilkCoffe(500,true);

	}
}
