package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {

	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);

	No07_Kaup() {
		this(0, 0); // 몇개의 매개변수가 모르기 때문에 일종의  생성자의 매개변수를 이 경우 2개로 설정해놓고 아래 2개의 메소드를 구현해놓음.
	}

	public No07_Kaup(double i, double j) {
		this.height = i;
		this.weight = j;
		this.idx = (int) (weight / ((Math.pow(height, 2)) * 10000));
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = scanner.nextDouble();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = scanner.nextDouble();
	}

	String getMsg() {
		String msg = "";
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else if (idx > 10) {
			msg = "영양실조";
		} else {
			msg = "소모증";
		}
		return msg;
	}

	@Override
	public String toString() {
		return " 카우프지수 [키 =" + height + "cm , 몸무게=" + weight + "kg 카우프지수= "
				+ getMsg() + "]";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" 키를 입력하세요 : ");
		double height = scanner.nextDouble();
		System.out.println(" 몸무게를 입력하세요 : ");
		double weight = scanner.nextDouble();
		

		No07_Kaup kaup = new No07_Kaup(height, weight);
		System.out.print(kaup.toString());
		System.out.println("완료");
		scanner.close();
		
		//  static영역에서는 가급적 변수 선언 하지 마라!!
		//  scanner 의 경우 메인에서 구현하게 하라!! 
		//  메인에 있는 걸 가급적 객체화하라!!

	}
}
