package oop01_EnCapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		PayService service = new PayService();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name =service.Name(scanner.nextLine());
		System.out.println("본봉 입력 (만원) :");
		int salary =service.Salary(scanner.nextInt());

		System.out.println("====== 급여 내역 =======");
		
		System.out.println("이름(name) :  " + name );
		System.out.println("본봉(salary) : " + salary);
		System.out.println("세금(tax) :  " + service.ShowTax(salary));
		System.out.println("실수령(income) :  " +service.ShowIncome(salary) );
		scanner.close();
	}

}
