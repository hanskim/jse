package comm04.arr;

public class No02_StringVo {

	void add() {      // Ŭ������ ����޼ҵ带 �������ִ� �۾�

		String[] juso = new String[3];
		juso[0] = "��⵵";
		juso[1] = "������";
		juso[2] = "��ȱ�";

		int i = 0;  // �������� for�� ���� �ܺο��� �ʱ�ȭ �����ϰ� ����
		
		for (; i < juso.length; i++) {
			System.out.println("juso[" + i + "]�� ��:" + juso[i]);
		}

	}
}
