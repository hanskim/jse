package oop01_EnCapsule;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {

		PayVO vo1 = new PayVO();

		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		vo1.setName(scanner.nextLine());
		System.out.println("���� �Է� :");
		vo1.setSalary(scanner.nextInt());

		System.out.println("====== �޿� ���� =====");
		System.out.println("�̸� :  " + vo1.getName());
		System.out.println("���� : " + vo1.getSalary());
		System.out.println("���� :  " + vo1.getTax());
		System.out.println("�Ǽ��� :  " + vo1.getIncome());
		
		scanner.close();

	}
}
