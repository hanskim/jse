package oop06_lotto;

public class LottoServiceImpl implements LotteService {
	private int money;
	int[] lottos;
	int count;

	@Override
	public void extractLotto(int money) {
		lottos = new int[6];
		this.count = this.getCount(money); // 게임수 (=행수)를 입력받는 변수
		for (int i = 0; i < count; i++) { // 행 수를 loop
			for (int j = 0; j < 6; j++) { // 열 loop ,열은 크기는 정해짐
				this.lottos[j] = this.getRandomNum(); // random 입력 받기 , 정렬 전
				System.out.print(lottos[j] + "  "); // 행의 열 값 출력 ,  수밖에	 없다.
				for (int k = j + 1; k <= 0; k--) { // random 입력 받을 時 앞에 입력된 요소들 !! 과 중복검사 loop
								
					if (lottos[j] == lottos[k]) { // 뒤에 들어온 값이 앞에 들어간 값들과 같은지
													// loop로 비교 / yes = 증감식 취소 / // no = 진행 // lottos[k]를 출력하는게 아님.
						j--; // yes일 경우 행 증가를 취소해서 다시 loop
						
					} // if종료
				}
				
			} // for2종료
			
			System.out.println(""); // 각 행의 엔터
		} // 출력 종료
	} // 메소드 종료 > 오름차순 정렬은 되어있지 않다. > sort 必!

	@Override
	public void printLotto() { // lotto 게임 상황과 제목 출력

		System.out.println("총" + this.money / 1000 + "회 게임 진행");
		System.out.println("거스름돈:" + this.money % 1000);
		System.out.println("=========== 대박 기원 !! ===========");
		
	}

	@Override
	public void inputMoney(int money) { // 금액 투입
		this.money = money;
	}

	@Override
	public int getRandomNum() {
		return (int) ((Math.random() * 45) + 1);
	}

	@Override
	public boolean isDuplication() {   // 중복체크 ,
	
		return false;
	}

	@Override
	public void sort(int array[]) { // 추출한 값 sort함수
		this.lottos=array;
		int temp = 0;
		for (int i =0; i < lottos.length-1; i++) {
			for (int j = 0; j < lottos.length-1-i; j++) { // 버블, 스왑 알고리즘
				if (lottos[j] > lottos[j + 1]) {
					temp = lottos[j];
					lottos[j] = lottos[j + 1];
					lottos[j + 1] = temp;
				}
			}
			System.out.println("[" + lottos + "]");
		}
	}

	@Override
	public int getCount(int money) { // 총 게임수 (= 출력물의 행) 을 반환하는 기능

		if (money < 1000) {
			return 0; //
		}
		return (int) Math.ceil(money / 1000); //
	}
}
