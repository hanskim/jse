package oop06_lotto;

import java.util.Scanner;


public class LottoMain {
	public static void main(String[] args) {
		System.out.println("◀◀◀◀◀   로또시작 ▶▶▶▶▶");
		LotteService lotto = new LottoServiceImpl();
		System.out.println("얼마치 로또게임 하겠습니까 ? ▶");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		lotto.inputMoney(money);
		lotto.getCount(money);
		lotto.printLotto();
		lotto.extractLotto(money);
		
		System.out.println("");
	}

}
