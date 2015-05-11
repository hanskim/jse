package comm02.op;

import java.util.Scanner;

public class No02_IfelseDemo {

	int big; // ?

	public void getBig(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("가장큰 수는" + a + "입니다.");
		} else if (b > a && b > c) {
			System.out.println("가장큰 수는" + b + "입니다.");
		} else {
			System.out.println("가장큰 수는" + c + "입니다.");
		}
	}

	public static void main(String[] args) {

		No02_IfelseDemo instance = new No02_IfelseDemo();
		Scanner scan = new Scanner(System.in);

		System.out.println("a값을 입력하세요");
		int a = scan.nextInt();
		System.out.println("b값을 입력하세요");
		int b = scan.nextInt();
		System.out.println("c값을 입력하세요");
		int c = scan.nextInt();
		
		instance.getBig(a, b, c);
		scan.close();

	}

}
