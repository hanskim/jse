package oop01_EnCapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		
		RpsService service = new RpsService();
		
		System.out.println("���������������� �����մϴ�.");
		System.out.println("���� :1 , ���� :2 , �� :3 �� �ϳ��� �Է� �ϼ���!:");
		Scanner scanner = new Scanner(System.in);
		int playerVal = scanner.nextInt();
		System.out.println("�÷��̾�� (����)�� �½��ϴ�.");	
		int comVal = service.DisplayComVal();
		System.out.println("��ǻ�ʹ� �� (����)�� �½��ϴ�.");	
		
		String winner = service.ShowWinner();
		System.out.println("�¸��ڴ�  (����)�Դϴ�..");
		
		
		
	}

}
