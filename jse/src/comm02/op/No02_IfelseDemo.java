package comm02.op;

import java.util.Scanner;

public class No02_IfelseDemo {

	int big; // ?

	public void getBig(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("����ū ����" + a + "�Դϴ�.");
		} else if (b > a && b > c) {
			System.out.println("����ū ����" + b + "�Դϴ�.");
		} else {
			System.out.println("����ū ����" + c + "�Դϴ�.");
		}
	}

	public static void main(String[] args) {

		No02_IfelseDemo instance = new No02_IfelseDemo();
		Scanner scan = new Scanner(System.in);

		System.out.println("a���� �Է��ϼ���");
		int a = scan.nextInt();
		System.out.println("b���� �Է��ϼ���");
		int b = scan.nextInt();
		System.out.println("c���� �Է��ϼ���");
		int c = scan.nextInt();
		
		instance.getBig(a, b, c);
		scan.close();

	}

}
