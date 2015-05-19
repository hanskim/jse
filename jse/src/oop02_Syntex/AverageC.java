package oop02_Syntex;

public class AverageC {

	public static void main(String[] args) {

		AverageVO vo = new AverageVO();

		vo.setName("ÇæÅ©");
		vo.setKor(95);
		vo.setEng(73);

		System.out.println("========" + vo.getName() + "ÀÇ ¼ºÀûÇ¥ " + "========");
		System.out.println("±¹¾î :" + vo.getKor());
		System.out.println("¿µ¾î :" + vo.getEng());
		System.out.println("ÃÑÁ¡ :" + vo.getTotal());
		System.out.println("Æò±Õ :" + vo.getAverage());

	}
}
