package oop02_Syntex;

/*
 * Date : 
 * Author : 
 * Desc : 
 * 
 * 
 */

public class CardVO {
	private String kind; // ī���� ����
	private int number; // ī���� ����
	static int width = 100; // ī���� ��
	static int height = 250; // ī���� ����

	public CardVO(String string, int i) {
		this.kind = string;
		this.number = i;
	}

	public String Result() {
		return this.kind + this.number;
	}

}
