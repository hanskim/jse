package oop01_EnCapsule;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		
		System.out.println("���ڸ��߱� ���� : ");
		System.out.println("(�� 3ȸ�� �Է� ����)");
		System.out.println(" ����� ����(����)�� �Է��ϼ��� : "); 
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();       // for���� controller�ȿ�  �ִ� ��� ������ ��.
		
		NumberMatchService service = new NumberMatchService();
		service.setInput(input) ;

	}
	}
