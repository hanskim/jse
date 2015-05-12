package cmm03.flow;

import java.util.Scanner;

public class No08_NumberMatch {
	public static void main(String[] args) {
		No08_NumberMatchVO vo = new No08_NumberMatchVO();

		for (int i = 0; i < 3; i++) {
			System.out.println("총 3회만 입력 가능");
			Scanner scanner = new Scanner(System.in);
			int result = 0;

			try {
				int input = scanner.nextInt();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("문자는 입력 금지!!");
			}

			if (vo.getPlayer() == 0) {
				System.out.println("다시입력해주세요");
			} else {
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}

			if (result == 1) {
				System.out.println(" 맞췄습니다. " + " 게임을 종료합니다. \n");
				break;
			} else if (i == 2) {
				System.out.println(" 3회 모두 참여했습니다.!!" + "\n게임패배" + "\n게임종료! ");
				break;
			}
			
		}
	}
}
