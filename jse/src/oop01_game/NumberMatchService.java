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
			System.out.println("���ڴ� �Է� ����!!");
		}

		if (vo.getPlayer() == 0) {
			System.out.println("�ٽ��Է����ּ���");
		} else {
			vo.setCom();
			result = game(vo.getCom(), vo.getPlayer());
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
		
		public int game(int com, int player) {
			int result;
			if (vo.getPlayer() == vo.getCom()) {
				System.out.println(vo.getPlayer() + "����!!");
				result = 1;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.!");
				System.out.println("��ǻ�Ͱ� ������ ���� : " + vo.getCom());
				result = 0;
			}
			return result;
		
		}	
		

}


