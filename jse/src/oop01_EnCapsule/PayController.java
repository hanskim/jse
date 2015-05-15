package oop01_EnCapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		PayService service = new PayService();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		service.servicename(scanner.nextLine());
		System.out.println("본봉 입력 :");
		service.servicesalary(scanner.nextInt());

		System.out.println("====== 급여 내역 =======");
		
		System.out.println("이름 :  " + );
		System.out.println("본봉 : " + );
		System.out.println("세금 :  " + service.showTax() );
		System.out.println("실수령 :  " + );
		
		scanner.close();


		
	}

}
