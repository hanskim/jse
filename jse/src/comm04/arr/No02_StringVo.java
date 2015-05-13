package comm04.arr;

public class No02_StringVo {

	void add() {      // 클래스에 멤버메소드를 생성해주는 작업

		String[] juso = new String[3];
		juso[0] = "경기도";
		juso[1] = "수원시";
		juso[2] = "장안구";

		int i = 0;  // 여러개의 for문 사용시 외부에서 초기화 설정하고 시작
		
		for (; i < juso.length; i++) {
			System.out.println("juso[" + i + "]의 값:" + juso[i]);
		}

	}
}
