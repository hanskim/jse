package oop05_polymorphism.trycatch;

/*���ܴ� ���α׷� ���߽� �߻��ϴ� �����ʹ� �ٸ� ����
 * ���α׷� ���� �� �߻��ϴ� ������ ���� ��ó�� �ʼ�
 * ���������� ������ �� ��߿� �߻��ϴ� ������ ��κ��� ����
 * ���ܴ� �ڵ�� �߻���, ������ �ٸ��� �����Ͻ� ������ �߻����� ����
 * 
 * 	try {
 *  // ���ܰ� �߻��� ������ �ִ� �ڵ带 �����ڰ� �����Ͽ� ����, 
 *  // I.O. ,  DBMS , Network ���� �ڵ尡 �ַ� ��ġ

 } catch (Exception ex) {
 ex.printStackTrace()
 // ������ ����Ǵ� �ڵ� ����
 }
 * 
 * 
 * 
 */

public class TryCatchDemo {
	public static void main(String[] args) {
		int a = 5, b = 0;
		int mok = 0, nmg = 0;

		try {
			mok = a / b;
			nmg = a % b;

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����߻�");
		}
		System.out.println(a + "/" + b + "=" + mok);
		System.out.println(a + "%" + b + "=" + nmg);
	}

}