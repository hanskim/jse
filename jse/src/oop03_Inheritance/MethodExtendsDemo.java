package oop03_Inheritance;

/*
 *Date : 
 *Author : 
 *Desc : �޼ҵ���
 *
 *Car    
 * �� 
 * |
 *  Mcar   <==== new (instantiate)   // ������ ������ ���踦 'use" �� ������� �Ѵ�
 *                                   // �θ�� �� 
 */

class Car2 {
	String name = "�ڵ���";

	public String gear() {
		return "�������";
	}
}

class HCar2 extends Car2 {
	String brand = "������";
	public String autogear() {
		return "������";
	}
}

public class MethodExtendsDemo {
	public static void main(String[] args) {
		HCar2 hcar2 = new HCar2();
		System.out.println(hcar2.gear());
		System.out.println(hcar2.autogear());
		
		Car2 car2 = new Car2();
		System.out.println(car2.gear());
		//  System.out.println(car2.autogear()); ����Ͽ� ���� �� �ִ� ������ �ڽĸ� �����ϴ�

	}
}
