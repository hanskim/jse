package cmm03.flow;

public class No02_IfelseDemo2 {

	public static void main(String[] args) {
		int kor = 80, eng = 90, sum = 0;
		double avg = 0.0;
		String msg = "�޽���";
		sum = kor + eng;
		avg = sum / 2;
		
		
		
		if (avg == 100.0) {
			System.out.println("���ʽ�����\n");

		} else if (avg >= 70.0) {
			System.out.println("�����հ�\n");

		} else {
			System.out.println("�������\n");
		}

		System.out.println(" ���� : " + kor);
		System.out.println(" ���� : " + eng);
		System.out.println(" ���� : " + sum);
		System.out.println(" ��� : " + avg);
		System.out.println(msg);

	}
}
