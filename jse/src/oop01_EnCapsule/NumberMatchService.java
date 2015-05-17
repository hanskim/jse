package oop01_EnCapsule;

public class NumberMatchService {
	
	public void game(int input) {
		NumberMatchVO vo = new NumberMatchVO();
		vo.setPlayer(input);
		vo.setCom();

		if (vo.getPlayer() == vo.getCom()) {
			System.out.println(vo.getPlayer() + "정답!!");
		} else {
			System.out.println("삑!! 불일치!!.");
			System.out.println("컴퓨터가 선택한 값은 " + vo.getCom() + " 입니다.");
		}
	}
}