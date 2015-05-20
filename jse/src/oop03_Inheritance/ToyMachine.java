package oop03_Inheritance;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ToyMachine {
	private Vector<ToyVO> toys;
	private ToyVO toy;

	private ToyMachine() {
		this(10, 5);
	}

	private ToyMachine(int caps, int increment) {
		toys = new Vector<ToyVO>(caps, increment);
	}

	public void regis(String name, int price, ToySpec spec) {
		ToyVO toy = new ToyVO (name, price, spec);
		toys.addElement(toy);
	}

	public Vector<ToyVO> searchName(String name){
		Vector <ToyVO> catchToys =new Vector<ToyVO>();
		for (int i = 0; i < toys.size(); i++) {
			while( toy instanceof ToyVO){
				if(toy.getName().equalsIgnoreCase(name));
				catchToys.add(toy);
			}
			System.out.println(toy.getName()+"인형");
			
		}
		return catchToys;
	}

	public static void main(String[] args) {
		ToyMachine ToyMachine = new ToyMachine();
		ToySpec spec = new ToySpec();
		spec.setProperty("사용자", ToyUser.ADULT);
		spec.setProperty("타입", ToyType.FIGURE);
		ToyMachine.regis("스파이더맨", 50000, spec);
		List<ToyVO> list =ToyMachine.getAll();
		for (ToyVO toy : list) {
			System.out.println(toy);
			
		}

	}

	private List<ToyVO> getAll() {
		return toys;
	}
}
