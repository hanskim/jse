package oop09_NestedClass;

/* ����Ŭ������ 2��° ����  ; 
 ���� ���� Ŭ���������� �ܺ� Ŭ������ ����� �����ϴµ� ������ ����.
 �ܺ�Ŭ������ ��������� ������ �� ������ �޼ҵ� ������ ���������� ������ �� ����.
 ���������� �߿��� �������ΰ� ���� �� �̷� ��� ���
 */

public class InnerClassLocal {
	int a = 100;

	public void innerTest(int k) {
		int b = 200;
		final int c = k;

		class Inner {                 // �ƹ����� �޼ҵ�ϱ� ���ú����̴�.
			public void getData() {
				System.out.println("������� a " + a);
				System.out.println("��� c " + c);
				// System.out.println("�������� b " + b);
				// Cannot refer to the non-final local variable b defined in an
				// enclosing scope
			}
		}

		Inner inn = new Inner();
		inn.getData();
	}

}
