package intro;


// Ercan Kaymaz

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu="?nternet ?ubesi";
		int vade=36;
		double dolarDun=8.30;
		double dolarBugun=8.18;
		
		boolean dustuMu=false;
		
		if (dolarBugun>dolarDun) {
			dustuMu=false;
			System.err.println(dustuMu);
		}else if (dolarBugun==dolarDun) {
			System.err.println("E?it durumlar...");
		} else {
			dustuMu=true;
			System.err.println(dustuMu);
		}
				
		String[] krediler= {
			"H?zl? kredi",
			"Msb Kredisi",
			"Konut Kredisi",
			"Ara? Kredisi",
			"??yeri Kredisi",
			"Ek Kredi"
		};
		
		//foreach
		for (String kredi : krediler) {
			System.err.println(kredi);
		}
		
		//for
		
		for (int i = 0; i < krediler.length; i++) {
			System.err.println(krediler[i]+" For D?ng?s?nden Gelen Verilerdir....");
		}
		int sayi1=10;
		int sayi2=20;
		
		sayi1=sayi2;
		sayi2=100;
		System.err.println(sayi1);
		
		int sayilar1[]= {1,2,3,4,5};
		int sayilar2[]= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.err.println(sayilar1[0]);
	}

}
