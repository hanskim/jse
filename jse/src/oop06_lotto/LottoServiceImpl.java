package oop06_lotto;

public class LottoServiceImpl implements LotteService {
	private int money;
	int[] lottos;
	int count;

	@Override
	public void extractLotto(int money) {
		lottos = new int[6];
		this.count = this.getCount(money); // ���Ӽ� (=���)�� �Է¹޴� ����
		for (int i = 0; i < count; i++) { // �� ���� loop
			for (int j = 0; j < 6; j++) { // �� loop ,���� ũ��� ������
				this.lottos[j] = this.getRandomNum(); // random �Է� �ޱ� , ���� ��
				System.out.print(lottos[j] + "  "); // ���� �� �� ��� ,  ���ۿ�	 ����.
				for (int k = j + 1; k <= 0; k--) { // random �Է� ���� �� �տ� �Էµ� ��ҵ� !! �� �ߺ��˻� loop
								
					if (lottos[j] == lottos[k]) { // �ڿ� ���� ���� �տ� �� ����� ������
													// loop�� �� / yes = ������ ��� / // no = ���� // lottos[k]�� ����ϴ°� �ƴ�.
						j--; // yes�� ��� �� ������ ����ؼ� �ٽ� loop
						
					} // if����
				}
				
			} // for2����
			
			System.out.println(""); // �� ���� ����
		} // ��� ����
	} // �޼ҵ� ���� > �������� ������ �Ǿ����� �ʴ�. > sort ��!

	@Override
	public void printLotto() { // lotto ���� ��Ȳ�� ���� ���

		System.out.println("��" + this.money / 1000 + "ȸ ���� ����");
		System.out.println("�Ž�����:" + this.money % 1000);
		System.out.println("=========== ��� ��� !! ===========");
		
	}

	@Override
	public void inputMoney(int money) { // �ݾ� ����
		this.money = money;
	}

	@Override
	public int getRandomNum() {
		return (int) ((Math.random() * 45) + 1);
	}

	@Override
	public boolean isDuplication() {   // �ߺ�üũ ,
	
		return false;
	}

	@Override
	public void sort(int array[]) { // ������ �� sort�Լ�
		this.lottos=array;
		int temp = 0;
		for (int i =0; i < lottos.length-1; i++) {
			for (int j = 0; j < lottos.length-1-i; j++) { // ����, ���� �˰���
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
	public int getCount(int money) { // �� ���Ӽ� (= ��¹��� ��) �� ��ȯ�ϴ� ���

		if (money < 1000) {
			return 0; //
		}
		return (int) Math.ceil(money / 1000); //
	}
}
