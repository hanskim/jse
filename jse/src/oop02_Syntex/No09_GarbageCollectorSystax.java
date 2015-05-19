package oop02_Syntex;

/*�ڹ� ������ �ڵ����� ������
 * ����޼ҵ� �ȿ��� ������ ��ü�� �޼ҵ� ���� �� ���� �޸𸮰� ȸ����.
 * �⺯�� �޸� ȸ�� ������ ���� ��ġ�� ��
 * ������ ���� �ʴ� �޸� ����, System.gc()
 * �켱 ������ ���� ������� ����.
 * �Ϲ����� ��� ��� �����尡 ����� �� ����
 * gc()�� �����ϸ� ������ �޸� ȸ�� �۾��� �ϰ� �Ǿ�
 * Finalize() �� ȣ��ȴ�. �׷��� gc() ��ü��  ���� ���ϸ� �����ϹǷ� jvm�� �����ϵ��� ��.
 */

public class No09_GarbageCollectorSystax {
	public static void main(String[] args) {
		Garbage[] gs = new Garbage[10] ; 
		//��ü����
	}
	
class Garbage{
		int objNo;
		public  Garbage(int n) {
			objNo = n ; 
			System.out.println("Garbage Class"+objNo+"�� �������");
		}
		
		
		// ��ü�� �޸𸮸� ȸ���� �� �ڵ����� ȣ���
		
		protected void finalize() throws Throwable{
			System.out.println("Garbage Class"+objNo+"���� ���̴� �޸𸮰�  ȸ����");
		
	}

}
}
