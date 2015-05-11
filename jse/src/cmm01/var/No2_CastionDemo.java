package cmm01.var;

public class No2_CastionDemo {
	public static void main(String[] args) {
		
		/*
		 * 작은 데이터 -> 큰 데이터 Upcasting 변환 conversion promotion 묵시적(implicit) 자바가
		 * 제공하는 자동형변환
		 */
		byte varByte = 1;
		int varInt = 123;
		double varDou = 123.456d;
		int upByte = (int) varByte;
		double upInt = varInt;
		
		System.out.println("varDou : " +varDou);
		System.out.println("upByte : " +upByte);
		System.out.println("upInt : " +upInt);

		/*
		 * 큰 데이터 -> 작은 데이터 일반적으로 casting 이라하면 downcasting만 말함. 강제형변환 축소가 되는 경우
		 * 반드시 강제로 캐스팅해야함 !! 데이터 손실 발생 우려!!
		 */
		float varflo = 123.456f;
		int downflo = (int) varflo;
		System.out.println("다운캐스팅 결과값 :" + downflo);

	}
}
