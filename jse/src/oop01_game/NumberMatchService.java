package oop01_game;



public class NumberMatchService {
	
	private int input ; 
	
	
	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	NumberMatchVO vo = new NumberMatchVO();
	
	
	public void forexe(){
		
	for (int i = 0; i < 3; i++) {
		
		int result =0 ;

		try {
			int input ;
			vo.setPlayer(this.input);
			
		} catch (Exception e) {
			System.out.println("문자는 입력 금지!!");
		}

		if (vo.getPlayer() == 0) {
			System.out.println("다시입력해주세요");
		} else {
			vo.setCom();
			result = game(vo.getCom(), vo.getPlayer());
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
		
		public int game(int com, int player) {
			int result;
			if (vo.getPlayer() == vo.getCom()) {
				System.out.println(vo.getPlayer() + "정답!!");
				result = 1;
			} else {
				System.out.println("틀렸습니다.!");
				System.out.println("컴퓨터가 선택한 값은 : " + vo.getCom());
				result = 0;
			}
			return result;
		
		}	
		

}


