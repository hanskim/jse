package oop03_Inheritance;

public class MinusAccount extends BankAccount {
	private int minusLimit;

	public void setAccount(String accountNum, String accountPass,
			String ownerName, int pay, int minusLimit) {
		this.accountNum = accountNum;
		this.accountPass = accountPass;
		this.ownerName=ownerName;
		this.balance = pay;
		this.minusLimit = minusLimit;
	}

	public void defrayment(int pay) {
		if (this.balance + this.minusLimit >= pay) {
			this.balance = this.balance - pay;
			System.out.println(pay + "������ ����߽��ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
		

	}
}
