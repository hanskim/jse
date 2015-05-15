package oop01_EnCapsule;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {

		PayVO vo1 = new PayVO();

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		vo1.setName(scanner.nextLine());
		System.out.println("본봉 입력 :");
		vo1.setSalary(scanner.nextInt());

		System.out.println("====== 급여 내역 =====");
		System.out.println("이름 :  " + vo1.getName());
		System.out.println("본봉 : " + vo1.getSalary());
		System.out.println("세금 :  " + vo1.getTax());
		System.out.println("실수령 :  " + vo1.getIncome());
		
		scanner.close();

	}
}
