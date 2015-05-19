package oop02_Syntex;

public class Rectangle {
	
	public int width = 0 ; 
	public int height=0 ;
	public Point origin ;   // �ͼ��� ���� Point origin = new new Point(0,0);
	                        // �� ������ ���� ��!!
	public Rectangle() {
		origin = new Point(0,0);
	}
	public Rectangle(Point p) {
		origin = p;
	}
	public Rectangle(int w, int h){
		origin = new Point(0,0);
		width =w ; 
		height= h ; 
	}
	public Rectangle(Point p , int w, int h){
		origin = p;
		width =w ; 
		height= h ; 
	}
	
	// �簢���� �����̴� �޼ҵ�
	// ���� ��ġ�� p���� ��
	public void move(int x, int y){
	  origin.x=x;       // �����ڴ� �ʱ�ȭ ���� �Ӹ� �ƴ϶� ���� ��ü�� ���°��� �ٲٴ� ����� �Ѵ�.
	  origin.y=y;       // �����ڴ� �ʱ�ȭ ���� �Ӹ� �ƴ϶� ���� ��ü�� ���°��� �ٲٴ� ����� �Ѵ�.
	
	}
	
	// �簢���� ������ ���ϴ� �޼ҵ�
	public int getArea(){
		return this.height*this.width ;
	}

	
	
	
	
	
	
	

}
