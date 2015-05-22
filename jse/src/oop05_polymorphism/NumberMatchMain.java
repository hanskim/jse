package oop05_polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		
		NumberMatchService service = new NumberMatchServiceImpl();

		System.out.println("홀짝 게임(총 3세판!)");
		Scanner scanner = new Scanner(System.in);
		// for문을 controller안에 넣는 방법 생각할 것.
		

		for (int i = 0; i < 3; i++) {
			System.out.println("홀짝입력 :");

			try {
				int comVal = service.makeComVal();
				int playVal = scanner.nextInt();
				service.match(playVal, comVal) ;

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
