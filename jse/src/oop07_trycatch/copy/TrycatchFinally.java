package oop07_trycatch.copy;

/*
 * finally 
 * 예외발생 여부와 상관없이 반드시 실행되는 구문
 * 
 */

public class TrycatchFinally {
	public static void main(String[] args) {

		try {
			System.out.println("메소드 실행 중...");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("finally 실행 중...");
		}

	}

}
