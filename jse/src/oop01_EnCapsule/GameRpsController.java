package oop01_EnCapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("���������������� �����մϴ�.");
		System.out.println("���� :1 , ���� :2 , �� :3 �� �ϳ��� �Է� �ϼ���!:");
		Scanner scanner = new Scanner(System.in);
		
		GameRpsService service = new GameRpsService();
		int PlayerValue = scanner.nextInt();
		service.ShowComValue();
		
		System.out.println("����� " + PlayerValue + "�� �½��ϴ�.\n");
		System.out.println("��ǻ�ʹ� " + service.ShowComValue() + "�� �½��ϴ�.\n");
		//System.out.println("���ڴ� " +   +"�Դϴ�." );
		
	   

		
		
		
	}

}
