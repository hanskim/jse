package oop01_Syntex;

public class Bycle {
	
	private int cadence ; 
	private int gear ; 
	private int speed ; 
	private int id ; 
	
	private static int numberofBycles =0;
	
	public Bycle(int startCadence, int startGear, int startSpeed){
		super() ; 
		this.cadence=startCadence ; 
		this.gear =startGear ; 
		this.speed=startSpeed ; 
		this.id =++numberofBycles;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	
	//사용자정의 메소드
	public void applyBrak(int decrement){
		speed -=decrement ; 
	}
	
	public void speedup(int increment){
		speed +=increment ; 
	}
	

	public static int getNumberofBycles() {
		return numberofBycles;
	}

	public static void setNumberofBycles(int numberofBycles) {
		Bycle.numberofBycles = numberofBycles;
	}
	
	

}
