package oop02_Syntex;

class MilkCoffe{
	int money ;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;              // 여기성의 this 는 멤변  
	}

	public MilkCoffe() {
		System.out.println("돈을 낸다");
	}

	public MilkCoffe(int money) {
		this();                            // 여기서는 메소드
		System.out.println(money + "원");
	}

	public MilkCoffe(int money, boolean exist) {
		this(money);
		System.out.println("구매가능여부 :" + (exist == true ? "커피종류선택" : "커피없음"));
	}
}

public class CoffeB {
	public static void main(String[] args) {
		
	/*
	 * 돈을 넣다
	 * 500원
	 * 구매가능여부  : 커피종류선택
	 */
	
	MilkCoffe milkCoffe =new MilkCoffe(500,true);

	}
}
