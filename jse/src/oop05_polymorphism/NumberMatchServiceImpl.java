package oop05_polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService {
	
    int comVal ;
    String comJakHole   ; 
    
	@Override
	public int makeComVal() {
		 this.comVal = (int)((Math.random()*3)+1);
		 return comVal ;
	}

	@Override
	public boolean match(int playVal, int comVal) {
		 boolean b = false ; 
		 switch (comVal%2) {
		 case 0 :
			 this. comJakHole ="¦��";
			break;
		default:
			this.comJakHole ="Ȧ��";
			break;
		}
			return b;
	}


	@Override
	public String display() {
		return "";
	}

}
