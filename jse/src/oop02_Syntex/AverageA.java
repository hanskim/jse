package oop02_Syntex;

public class AverageA {
	
	String name ; 
	int kor ; 
	int eng ; 
	

	public static void main(String[] args) {
		
		AverageA avg1 = new AverageA();
		
		int total ; 
		double average ; 
		
		avg1.name ="ÇæÅ© " ; 
		avg1.kor = 95; 
		avg1.eng = 45; 
		total = avg1.kor +avg1.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg1.name +"ÀÇ ¼ºÀûÇ¥ "+ "========");
		System.out.println( "±¹¾î :" +avg1.kor );
		System.out.println( "¿µ¾î :" +avg1.eng );
		System.out.println( "ÃÑÁ¡ :" +total );
		System.out.println( "Æò±Õ :" +average );
	
		avg1.name ="¾ÆÀÌ¾ð¸Ç " ; 
		avg1.kor = 75; 
		avg1.eng = 85; 
		total = avg1.kor +avg1.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg1.name +"ÀÇ ¼ºÀûÇ¥ "+ "========");
		System.out.println( "±¹¾î :" +avg1.kor );
		System.out.println( "¿µ¾î :" +avg1.eng );
		System.out.println( "ÃÑÁ¡ :" +total );
		System.out.println( "Æò±Õ :" +average );
	
		avg1.name ="Åä¸£ " ; 
		avg1.kor = 85; 
		avg1.eng = 65; 
		total = avg1.kor +avg1.eng ; 
		average = total/2d ; 
		
		System.out.println( "========"+ avg1.name +"ÀÇ ¼ºÀûÇ¥ "+ "========");
		System.out.println( "±¹¾î :" +avg1.kor );
		System.out.println( "¿µ¾î :" +avg1.eng );
		System.out.println( "ÃÑÁ¡ :" +total );
		System.out.println( "Æò±Õ :" +average );

	}

}
