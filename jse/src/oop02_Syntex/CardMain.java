package oop02_Syntex;

public class CardMain {
	public static void main(String[] args) {
		
		CardVO vo1 = new CardVO("하트",3);
		CardVO vo2 = new CardVO("스페이스",5);
		
		System.out.println("카드 높이 : "+CardVO.width);
		System.out.println("카드 폭 : "+CardVO.height);
		
		// 인스턴스 생성 후 아래 결과처럼 보이게끔 출력되도록
		
		//vo.PlayerResult(String , x) ; 
		//vo.ComputerResult()
		
		System.out.println("플레이어는 "+ vo1.Result() + "입니다." );
		System.out.println("컴퓨터가 " + vo2.Result()+ "라서 (컴퓨터)가 이겼습니다.");
		
	}

}
