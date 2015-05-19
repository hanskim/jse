package oop02_Syntex;

public class AverageD {
	public static void main(String[] args) {
		
		AverageService service = new AverageService();
	
		service.Input("ÇæÅ©",95,73);
		
		System.out.println("========"+service.getName()+ "ÀÇ ¼ºÀûÇ¥========");
		System.out.println("±¹¾î :" + service.getKor());
		System.out.println("¿µ¾î :"+service.getEng());
		System.out.println("ÃÑÁ¡ :" +service.getTotal() );
		System.out.println("Æò±Õ :" +service.getAverage() );
	}
	}
	
