package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchDemo {

	public static void main(String[] args) {

		System.out.println(" ��������Է� : ");
		Scanner scanner = new Scanner(System.in);
		int avg = scanner.nextInt();
		int val = 0;
		int avg2= avg ; 
		scanner.close();

		do {
			avg /= 10;
			val += 1;
		} while (avg > 0);
		System.out.println("�Է¹��� ������ �ڸ��� : " + val);
		System.out.println("");

		/*
		 * do { System.out.println(" ��������Է� : "); avg = scanner.nextInt();
		 * }while(avg >= 100 || avg <0); String result = "";
		 */

		/*
		 * if (avg >= 90) { result = "����հ�"; } else if (avg >=80) { result =
		 * "�Ϲ��հ�"; } else { result = "�����"; }
		 */

		// ���׿����� test
		// result = avg >=90 ? "�ֿ���հ�" : (avg >= 80 ? "�Ϲ��հ�" :"���հ�");
		// System.out.print(result);

		String grade = "";

		switch (avg2/((int)(Math.pow(10,val-1)))){
		case 10:
		case 9:
			grade = "����հ�";
			break;
		case 8:
			grade = "�հ�";
			break;
		default:
			grade = "���հ�";
			break;
		}

		System.out.println("�Է��� ����� : " + avg2 + "���̸� ����� " + grade + "�Դϴ�.");

	}
}
