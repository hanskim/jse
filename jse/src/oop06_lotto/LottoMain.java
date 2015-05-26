package oop06_lotto;

import java.util.Scanner;


public class LottoMain {
	public static void main(String[] args) {
		System.out.println("◀◀◀◀◀   로또시작 ▶▶▶▶▶");
		LotteService lotto = new LottoServiceImpl();
		System.out.println("얼마치 로또게임 하겠습니까 ? ▶");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		lotto.extractLotto(money);
		System.out.println("로또번호 출력 :");
		lotto.printLotto();
		System.out.println("");
	}

}
