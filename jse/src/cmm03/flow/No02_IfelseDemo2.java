package cmm03.flow;

public class No02_IfelseDemo2 {

	public static void main(String[] args) {
		int kor = 80, eng = 90, sum = 0;
		double avg = 0.0;
		String msg = "메시지";
		sum = kor + eng;
		avg = sum / 2;
		
		
		
		if (avg == 100.0) {
			System.out.println("보너스지급\n");

		} else if (avg >= 70.0) {
			System.out.println("시험합격\n");

		} else {
			System.out.println("재시험대상\n");
		}

		System.out.println(" 국어 : " + kor);
		System.out.println(" 영어 : " + eng);
		System.out.println(" 총점 : " + sum);
		System.out.println(" 평균 : " + avg);
		System.out.println(msg);

	}
}
