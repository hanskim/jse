package oop02_Syntex;

public class AverageC {

	public static void main(String[] args) {

		AverageVO vo = new AverageVO();

		vo.setName("��ũ");
		vo.setKor(95);
		vo.setEng(73);

		System.out.println("========" + vo.getName() + "�� ����ǥ " + "========");
		System.out.println("���� :" + vo.getKor());
		System.out.println("���� :" + vo.getEng());
		System.out.println("���� :" + vo.getTotal());
		System.out.println("��� :" + vo.getAverage());

	}
}
