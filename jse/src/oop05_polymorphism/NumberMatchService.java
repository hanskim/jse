package oop05_polymorphism;

public interface NumberMatchService {

	// * 컴퓨터가 랜덤으로 생성하는 숫자  0과 1만 발생시킴
	public int makeComVal() ; 
	// 두개의 파라미터를 비교 / 일치하면 true , 다르면  false 리턴
	public boolean match(int playVal, int comVal);
	// makeComVal 리턴값이 true면 플레이어 승리, 다르면 컴퓨터 승리라고 메세지 출력
	public String display();
}
