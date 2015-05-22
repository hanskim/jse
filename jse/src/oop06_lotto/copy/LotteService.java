package oop06_lotto.copy;

public interface LotteService {
	// int money 만큼 로또용지를 출력하는 메소드 ,1000원단위
	// 만약 1000원 이하 금액이 있다면 거스름돈 같이 출력되야함
	public void extractLotto(int money);

	// 로또 번호를 출력하는 메소드
	// 로또번호는 1부터 45까지
	// 출력되는 결과는 오름차순 정렬이 되어 있어야함
	// 각 6개의 숫자가 한 묶음이고 (=행)
	// 1000원단위 돈만큼 행이 출력된다.
	// 출력된 숫자는 중복되지 않아야 한다
	// 거스름돈은 절삭!
	public void printLotto();

	// 돈을 입금한 후 필드에 저장하는 메소드
	// 이중배열 써야함
	public void inputMoney(int money);

	// Random 번호를 생성하는 메소드
	public int getRandomNum();

	public boolean isDuplication();

	// 금액이 결정된 후 몇번 extractionLotto돌릴 것이가 ?
	// 몇회전 하는지를 카운트하는 기능 포함
	public void sort(int arr[]);

	public int getCount(int money);

}
