package oop02_Syntex;

public class Rectangle {
	
	public int width = 0 ; 
	public int height=0 ;
	public Point origin ;   // 익숙한 문장 Point origin = new new Point(0,0);
	                        // 이 문장이 나뉜 거!!
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
	
	// 사각형을 움직이는 메소드
	// 원래 위치를 p라할 때
	public void move(int x, int y){
	  origin.x=x;       // 생성자는 초기화 역할 뿐만 아니라 현재 객체의 상태값을 바꾸는 기능을 한다.
	  origin.y=y;       // 생성자는 초기화 역할 뿐만 아니라 현재 객체의 상태값을 바꾸는 기능을 한다.
	
	}
	
	// 사각형의 면적을 구하는 메소드
	public int getArea(){
		return this.height*this.width ;
	}

	
	
	
	
	
	
	

}
