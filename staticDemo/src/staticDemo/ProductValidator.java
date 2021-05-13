package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yapýcý blok çalýþtý");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//inner class - tek sorumluluk prensibine aykýrý
	public static class Baskabisey{
		public static void Sil() {
			
		}
	}
}

//ürün fiyatý sýfýrdan büyük ve ürün adý boþ deðilse,true döndür.

//C#'dan farklý olarak;
//static olarak constructor çalýþtýrmak istersek "static" adýnda bir blok oluþturup çalýþtýrabiliriz.