package oop01_EnCapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		PayService service = new PayService();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		service.servicename(scanner.nextLine());
		System.out.println("���� �Է� :");
		service.servicesalary(scanner.nextInt());

		System.out.println("====== �޿� ���� =======");
		
		System.out.println("�̸� :  " + );
		System.out.println("���� : " + );
		System.out.println("���� :  " + service.showTax() );
		System.out.println("�Ǽ��� :  " + );
		
		scanner.close();


		
	}

}
