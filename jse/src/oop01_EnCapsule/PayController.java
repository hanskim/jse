package oop01_EnCapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		PayService service = new PayService();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		String name =service.Name(scanner.nextLine());
		System.out.println("���� �Է� (����) :");
		int salary =service.Salary(scanner.nextInt());

		System.out.println("====== �޿� ���� =======");
		
		System.out.println("�̸�(name) :  " + name );
		System.out.println("����(salary) : " + salary);
		System.out.println("����(tax) :  " + service.ShowTax(salary));
		System.out.println("�Ǽ���(income) :  " +service.ShowIncome(salary) );
		scanner.close();
	}

}
