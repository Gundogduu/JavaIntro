package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yap�c� blok �al��t�");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//inner class - tek sorumluluk prensibine ayk�r�
	public static class Baskabisey{
		public static void Sil() {
			
		}
	}
}

//�r�n fiyat� s�f�rdan b�y�k ve �r�n ad� bo� de�ilse,true d�nd�r.

//C#'dan farkl� olarak;
//static olarak constructor �al��t�rmak istersek "static" ad�nda bir blok olu�turup �al��t�rabiliriz.