package methods2;

//PARAMETRELÝ MEETODLARI ANLAMAK

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla2(4,6,8,7,5,2,3,1,5,4,7,8,6,9,12,5,500);
		System.out.println(sayi);	
		

	}
	
	//Void operasyonlarý emir kipi gibi düþünebilirsiniz.Bir þeyi yap dersiniz yapar.Deðer döndürmez.
	public static void ekle() {
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void güncelle() {
		System.out.println("güncellendi");
	}
	
	
	//deðer döndüren operasyonlar
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	
	// parametreye birden fazla deðer girebilmek için "..." Variable Arguments kullanýyoruz.
	//arka planda verileri diziye çeviriyor.
	//parametreye hiçbir deðer vermesenizde kýzmaz.
	//ilerde nesnelerle çalýþýrken test edilebilirliði zayýfladýðýndan hoca koleksiyonlarý ve biraz daha nesnel yapýlarý tercih ediyormuþ.
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi: sayilar) {
			toplam+=sayi;
		}		
		return toplam;
		
	}
}
