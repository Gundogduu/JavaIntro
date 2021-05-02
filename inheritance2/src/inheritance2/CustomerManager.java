package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//müsteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		//DatabaseLogger logger = new DatabaseLogger(); >>> yerine "Base" sýnýfýný parametreye yazarak kullanýcýnýn çalýþmak istediði logger'a göre loglama yapýlmasýný saðladýk.
		logger.log();
	}
}
