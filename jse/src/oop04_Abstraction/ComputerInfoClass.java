package oop04_Abstraction;

/*�⺯��  private�̹Ƿ� ���� �Ұ���
 * ���� �߻�Ŭ������ protected ����
 * ���� �����ߴµ� ������ private���� ��������
 * �׷��� �⺯�� ���� ������ü�� �θ� �ִ�
 * displayInfo() �� ȣ���ؼ� ó��
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
		 * �Ķ���ͷ� �Ѿ��  ���鵵 �ٷ� super�� ���� �θ� �޼ҵ��� �Ķ���ͷ� ������
		 * �ٷ� set �Ѵ�. �� �⺯�� ������ �θ��ڽİ��迡�� �����ϹǷ� �θ��� �⺯�� ���� ���ٵ� ����������.
		 */
		super.displayInfo();
		System.out.println("cpu:" + this.cpu);
		System.out.println("ram:" + this.ram);
		System.out.println("hdd:" + this.hdd);
	}
}
