package comm04.arr;

import java.util.Scanner;

public class No03_ForloopArrayDemo {
	public static void main(String[] args) {

		System.out.println(" 5���� ���� �Է� : ");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();

		No03_ForloopArrayVO vo = new No03_ForloopArrayVO();
		
        /*
		vo.setA(a);
		vo.setB(b);
		vo.setC(c);
		vo.setD(d);
		vo.setE(e);
	    */
		vo.Arry(a,b,c,d,e);
		
		scanner.close();

	}

}
