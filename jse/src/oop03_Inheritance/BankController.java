package oop03_Inheritance;

public class BankController {
	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
		bankaccount.setAccount("123456", "1234", "헐크", 100);
		bankaccount.printAccount();
		bankaccount.deposit(100);
		bankaccount.printAccount();
		bankaccount.defrayment(300);
		bankaccount.printAccount();

		MinusAccount minusaccount = new MinusAccount();
		minusaccount.setAccount("456789", "45678", "아이언맨", 500);
		minusaccount.printAccount();
		minusaccount.deposit(100);
		minusaccount.printAccount();
		minusaccount.defrayment(300);
		minusaccount.printAccount();
		minusaccount.defrayment(500);
		minusaccount.printAccount();
	}

}
