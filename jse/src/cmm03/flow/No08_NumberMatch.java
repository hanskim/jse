package cmm03.flow;

import java.util.Scanner;

public class No08_NumberMatch {
	public static void main(String[] args) {
		No08_NumberMatchVO vo = new No08_NumberMatchVO();

		for (int i = 0; i < 3; i++) {
			System.out.println("�� 3ȸ�� �Է� ����");
			Scanner scanner = new Scanner(System.in);
			int result = 0;

			try {
				int input = scanner.nextInt();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("���ڴ� �Է� ����!!");
			}

			if (vo.getPlayer() == 0) {
				System.out.println("�ٽ��Է����ּ���");
			} else {
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}

			if (result == 1) {
				System.out.println(" ������ϴ�. " + " ������ �����մϴ�. \n");
				break;
			} else if (i == 2) {
				System.out.println(" 3ȸ ��� �����߽��ϴ�.!!" + "\n�����й�" + "\n��������! ");
				break;
			}
			
		}
	}
}
