package oop04_Abstraction;

/*멤변이  private이므로 접근 불가능
 * 예전 추상클래스는 protected 여서
 * 접근 가능했는데 이제는 private으로 막혀있음
 * 그래서 멤변에 대한 접근자체도 부모에 있는
 * displayInfo() 를 호출해서 처리
 * 
 * 
 */

public class ComputerInfoClass extends ProductInfoClass {
	private String cpu;
	private String ram;
	private String hdd;

	void setInfo(String company, String name, String sid, String cpu,
			String ram, String hdd) {
		super.setInfo(company, name, sid);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}


	@Override
	public void displayInfo() {
		/*
		 * 파라미터로 넘어온  값들도 바로 super를 통해 부모 메소드의 파라미터로 던져서
		 * 바로 set 한다. 즉 멤변의 공유가 부모자식관계에서 성립하므로 부모의 멤변에 대한 접근도 가능했졌다.
		 */
		super.displayInfo();
		System.out.println("cpu:" + this.cpu);
		System.out.println("ram:" + this.ram);
		System.out.println("hdd:" + this.hdd);
	}
}
