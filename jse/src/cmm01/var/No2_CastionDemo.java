package cmm01.var;

public class No2_CastionDemo {
	public static void main(String[] args) {
		
		/*
		 * ���� ������ -> ū ������ Upcasting ��ȯ conversion promotion ������(implicit) �ڹٰ�
		 * �����ϴ� �ڵ�����ȯ
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
		 * ū ������ -> ���� ������ �Ϲ������� casting �̶��ϸ� downcasting�� ����. ��������ȯ ��Ұ� �Ǵ� ���
		 * �ݵ�� ������ ĳ�����ؾ��� !! ������ �ս� �߻� ���!!
		 */
		float varflo = 123.456f;
		int downflo = (int) varflo;
		System.out.println("�ٿ�ĳ���� ����� :" + downflo);

	}
}
