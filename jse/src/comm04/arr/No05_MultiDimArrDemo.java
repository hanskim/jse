package comm04.arr;

public class No05_MultiDimArrDemo {
	public static void main(String[] args) {
		
		int[][] score ={
				{90,90,85},
				{27,20,56},
				{45,30,76},
				{40,85,49},
				{95,50,50}
		} ; 
		int korTotal =0 ; 
		int engTotal =0 ; 
		int mathTotal =0 ; 
		
		System.out.println("��ȣ \t ���� \t ���� \t ���� \t ���� \t ���");
		System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�");
		
		for (int i = 0; i < score.length; i++) {
			int sum =0 ; 
			korTotal +=score[i][0];
			engTotal +=score[i][1];
			mathTotal +=score[i][2];
			System.out.printf("" + (i+1)+ "\t"); 
			for (int j = 0; j < score[i].length; j++) {
				sum +=score[i][j];
				System.out.printf(score[i][j] +"\t");
			}
			System.out.printf(sum +"\t"+ Math.round(sum/(float)score[i].length));
			System.out.println("\t");
			}
		System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�");
		System.out.println("��������: "+korTotal +"\t"+engTotal+"\t"+mathTotal );
		}
	}


