package methods2;

//PARAMETREL� MEETODLARI ANLAMAK

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla2(4,6,8,7,5,2,3,1,5,4,7,8,6,9,12,5,500);
		System.out.println(sayi);	
		

	}
	
	//Void operasyonlar� emir kipi gibi d���nebilirsiniz.Bir �eyi yap dersiniz yapar.De�er d�nd�rmez.
	public static void ekle() {
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void g�ncelle() {
		System.out.println("g�ncellendi");
	}
	
	
	//de�er d�nd�ren operasyonlar
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	
	// parametreye birden fazla de�er girebilmek i�in "..." Variable Arguments kullan�yoruz.
	//arka planda verileri diziye �eviriyor.
	//parametreye hi�bir de�er vermesenizde k�zmaz.
	//ilerde nesnelerle �al���rken test edilebilirli�i zay�flad���ndan hoca koleksiyonlar� ve biraz daha nesnel yap�lar� tercih ediyormu�.
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi: sayilar) {
			toplam+=sayi;
		}		
		return toplam;
		
	}
}
