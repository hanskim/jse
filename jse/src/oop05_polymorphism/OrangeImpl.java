package oop05_polymorphism;

public class OrangeImpl implements FruitInterface {

	@Override
	public void display(String s) {
		System.out.println(s+"�������Դϴ�.");
	}
	
	public int  getcount() {
		return 1000;
	}

}
