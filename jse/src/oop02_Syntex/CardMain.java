package oop02_Syntex;

public class CardMain {
	public static void main(String[] args) {
		
		CardVO vo1 = new CardVO("��Ʈ",3);
		CardVO vo2 = new CardVO("�����̽�",5);
		
		System.out.println("ī�� ���� : "+CardVO.width);
		System.out.println("ī�� �� : "+CardVO.height);
		
		// �ν��Ͻ� ���� �� �Ʒ� ���ó�� ���̰Բ� ��µǵ���
		
		//vo.PlayerResult(String , x) ; 
		//vo.ComputerResult()
		
		System.out.println("�÷��̾�� "+ vo1.Result() + "�Դϴ�." );
		System.out.println("��ǻ�Ͱ� " + vo2.Result()+ "�� (��ǻ��)�� �̰���ϴ�.");
		
	}

}
