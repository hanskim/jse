package oop01_EnCapsule;

/*Date : 2015.05.15
 * Author : ���ѽ� , 
 * Description : ���������� ����
 * 1 = ����. 2= ����. 3 = �� 
 * 
 */

public class GameRpsService {

	// ���ڰ��� ���� ����, ����, �� ��η���
	public void ErrorMsg1(int playerValue) {
		System.out.println("�߸��Է��ϼ̽��ϴ�. ���Է� ��!!");
	}

	public void ErrorMsg2(int playerValue) {
		System.out.println("�Է¿��� : ���ڸ� �Է��ϼ���!");
	}

	public int ShowComValue() {
		return (int) ((Math.random() * 10) % 3) + 1; // ��ǻ���� 1~3���� ���Ǽ� ����
		                                             // �Ǵ� (int) Math.random()*3 +1
	}

	public String ShowRpsValue(int playerValue) {
		String result = "";
		switch (playerValue) {
		case 1:
			result = "����";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;
		}
		return result;
	}

	public String ShowWiner(int playerValue, int comValue) {
		String msg = "";

		if (playerValue == comValue) {
			msg = "�����ϴ�.(�����ϴ�).";

		} else if ((playerValue == 1 && comValue == 3)
				|| (playerValue == 2 && comValue == 1)
				|| (playerValue == 3 && comValue == 2)) {
			msg = "���!!";
		} else {
			msg = "��ǻ��!!";
		}
		
		/* switch (playerValue -comValue)
		 * String msg = "";   
		 * case 0 : break ;
		 * case 1 : -2 break ;
		 * �̷��� ������ε� ���� ����  ...
		 */
		return msg;
	}

}
