package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu = "Ýnternet Þubeye gir";
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		System.out.println(internetSubeButonu);
		
		int vade = 36;
		double dunkuDolar = 8.25;
		double bugunkuDolar = 8.20;
		boolean dustuMu = false;
		
		
		if(dunkuDolar<bugunkuDolar) {
			System.out.println("yukseldi");
		}
		else if(dunkuDolar>bugunkuDolar) {
			System.out.println("azaldi");
			
		}
		else {
			System.out.println("degismedi");
		}
		
		System.out.println("------------------------");
		
		String[] krediler = {
				"Hýzlý Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi"
		};
		
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("*******************");
		
		//for
		for(int i=0;i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}	
		
		System.out.println("++++++++++++++++++++++++");
		
		int number1=10;
		int number2 = 20;
		number1 = number2;
		number2 = 100;
		System.out.println(number1);
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		System.out.println(sehir1);
		
		float floatValue = 1.23f;
	    char character = 'a';
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
