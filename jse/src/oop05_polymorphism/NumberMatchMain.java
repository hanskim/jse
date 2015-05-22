package oop05_polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		
		NumberMatchService service = new NumberMatchServiceImpl();

		System.out.println("Ȧ¦ ����(�� 3����!)");
		Scanner scanner = new Scanner(System.in);
		// for���� controller�ȿ� �ִ� ��� ������ ��.
		

		for (int i = 0; i < 3; i++) {
			System.out.println("Ȧ¦�Է� :");

			try {
				int comVal = service.makeComVal();
				int playVal = scanner.nextInt();
				service.match(playVal, comVal) ;

			} catch (Exception e) {
				System.out.println("�����Է� �Ұ�!!");
			}

			if (i == 2) {
				System.out.println("3ȸ �Ϸ� ���� ����.");
			}

		}
		scanner.close();

	}

}
