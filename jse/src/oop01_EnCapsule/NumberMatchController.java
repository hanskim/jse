package oop01_EnCapsule;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {

		NumberMatchService service = new NumberMatchService();

		System.out.println("숫자맞추기 게임 : ");
		System.out.println("(총 3회만 입력 가능)");
		System.out.println(" 당신의 숫자(정수)를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		// for문을 controller안에 넣는 방법 생각할 것.

		for (int i = 0; i < 3; i++) {
			System.out.println("1부터 3까지의 정수 입력");

			try {
				int input = scanner.nextInt();
				service.game(input);

			} catch (Exception e) {
				System.out.println("문자입력 불가!!");
			}

			if (i == 2) {
				System.out.println("3회 완료 게임 종료.");
			}

		}
		scanner.close();

	}

}
