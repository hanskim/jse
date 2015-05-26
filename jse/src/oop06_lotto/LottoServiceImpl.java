package oop06_lotto;

public class LottoServiceImpl implements LotteService {
	private int money;
	int[][] lottos;
	int[][] arr;

	@Override
	public void extractLotto( int money) {
		inputMoney(money);
		int count =this.getCount(money);
		int i  =0 ; 
		for (count = 0; count <lottos.length; count++) {
			while (true){
				// 구현해야함
				// isDuplication메소드 사용 
				// 중복되지 않는 숫자이면  lottos[count][i] =num 의 형태로 돌아가게 됨
			}
		}
	}

	@Override
	public void printLotto() {
		// TODO Auto-generated method stub
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		int[][] lottos = new int[money / 1000][6];
	}

	@Override
	public int getRandomNum() {
		return (int) ((Math.random() * 45) + 1);
	}

	@Override
	public boolean isDuplication() {
		// 중복체크 ,
		return false;
	}

	@Override
	public void sort(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) { // 버블, 스왑 알고리즘
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	@Override
	public int getCount(int money) {

		if (money < 1000) {
			return 0; //
		}
		return (int) Math.ceil(money / 1000); //
	}
}
