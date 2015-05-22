package oop06_lotto.copy;

public interface LotteService {
	// int money ��ŭ �ζǿ����� ����ϴ� �޼ҵ� ,1000������
	// ���� 1000�� ���� �ݾ��� �ִٸ� �Ž����� ���� ��µǾ���
	public void extractLotto(int money);

	// �ζ� ��ȣ�� ����ϴ� �޼ҵ�
	// �ζǹ�ȣ�� 1���� 45����
	// ��µǴ� ����� �������� ������ �Ǿ� �־����
	// �� 6���� ���ڰ� �� �����̰� (=��)
	// 1000������ ����ŭ ���� ��µȴ�.
	// ��µ� ���ڴ� �ߺ����� �ʾƾ� �Ѵ�
	// �Ž������� ����!
	public void printLotto();

	// ���� �Ա��� �� �ʵ忡 �����ϴ� �޼ҵ�
	// ���߹迭 �����
	public void inputMoney(int money);

	// Random ��ȣ�� �����ϴ� �޼ҵ�
	public int getRandomNum();

	public boolean isDuplication();

	// �ݾ��� ������ �� ��� extractionLotto���� ���̰� ?
	// ��ȸ�� �ϴ����� ī��Ʈ�ϴ� ��� ����
	public void sort(int arr[]);

	public int getCount(int money);

}
