package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchDemo {

	public static void main(String[] args) {
		
		int avg ; 
		Scanner scanner = new Scanner(System.in);
		avg = scanner.nextInt();
		
		
		/*

		do {
			System.out.println(" ��������Է� : ");
			avg = scanner.nextInt();
		}while(avg >= 100 || avg <0);
			String result = "";
        */
		
		/*
		if (avg >= 90) {
			result = "����հ�";
		} else if (avg >=80) {
			result = "�Ϲ��հ�";
		} else {
			result = "�����";
		}
	 */
		
		
		//���׿����� test
		//result =  avg >=90 ?  "�ֿ���հ�" : (avg >= 80 ? "�Ϲ��հ�" :"���հ�");
		//System.out.print(result);
		
	
		String grade ="";
		
		switch (avg) {
		case 9  :
			grade ="����հ�";
			break;
		case 8 :
			grade ="�հ�";
			break;
		default:
			grade ="���հ�";
			break;
		}
		System.out.println("�Է��� ����� : " +avg + "���̸� ����� " + grade + "�Դϴ�." );
			
		
		scanner.close();

	}
}
