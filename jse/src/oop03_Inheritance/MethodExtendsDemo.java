package oop03_Inheritance;

/*
 *Date : 
 *Author : 
 *Desc : 메소드상속
 *
 *Car    
 * △ 
 * |
 *  Mcar   <==== new (instantiate)   // 좌측과 우측의 관계를 'use" 즉 사용관계라 한다
 *                                   // 부모와 자 
 */

class Car2 {
	String name = "자동차";

	public String gear() {
		return "수동기어";
	}
}

class HCar2 extends Car2 {
	String brand = "현대차";
	public String autogear() {
		return "오토기어";
	}
}

public class MethodExtendsDemo {
	public static void main(String[] args) {
		HCar2 hcar2 = new HCar2();
		System.out.println(hcar2.gear());
		System.out.println(hcar2.autogear());
		
		Car2 car2 = new Car2();
		System.out.println(car2.gear());
		//  System.out.println(car2.autogear()); 상속하여 받을 수 있는 로직은 자식만 가능하다

	}
}
