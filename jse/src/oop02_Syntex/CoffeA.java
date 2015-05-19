package oop02_Syntex;

class Coffe {
	public Coffe() {
		System.out.println("돈을 낸다");
	}

	public Coffe(int money) {
		System.out.println(money + "원");
	}

	public Coffe(int money, boolean exist) {
		System.out.println("구매가능여부 :" + (exist == true ? "커피종류선택" : "커피없음"));
	}

}

public class CoffeA {
	public static void main(String[] args) {
		Coffe c1 = new Coffe();
		Coffe c2 = new Coffe(500);
		Coffe c3 = new Coffe(500, true);
	}

}
