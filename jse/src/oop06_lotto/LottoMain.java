package oop06_lotto;

import java.util.Scanner;


public class LottoMain {
	public static void main(String[] args) {
		System.out.println("����������   �ζǽ��� ����������");
		LotteService lotto = new LottoServiceImpl();
		System.out.println("��ġ �ζǰ��� �ϰڽ��ϱ� ? ��");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		lotto.extractLotto(money);
		System.out.println("�ζǹ�ȣ ��� :");
		lotto.printLotto();
		System.out.println("");
	}

}
