package oop07_trycatch.copy;

/*
 * finally 
 * ���ܹ߻� ���ο� ������� �ݵ�� ����Ǵ� ����
 * 
 */

public class TrycatchFinally {
	public static void main(String[] args) {

		try {
			System.out.println("�޼ҵ� ���� ��...");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("finally ���� ��...");
		}

	}

}