package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
	}
}

//static yap�lar pek yayg�n de�il genelde b�yle utility dedi�imiz ara�larda kullan�yoruz.
//her metodu static yapmamal�y�z ��nk� "static metod" ilk olu�turuldu�u gibi kal�r,uygulama durdurulana kadar de�erleri de�i�tirilemez.
//kullan-b�rak �eklindeki yard�mc� ara�larda kullan�yoruz.