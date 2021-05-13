package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	}
}

//static yapýlar pek yaygýn deðil genelde böyle utility dediðimiz araçlarda kullanýyoruz.
//her metodu static yapmamalýyýz çünkü "static metod" ilk oluþturulduðu gibi kalýr,uygulama durdurulana kadar deðerleri deðiþtirilemez.
//kullan-býrak þeklindeki yardýmcý araçlarda kullanýyoruz.