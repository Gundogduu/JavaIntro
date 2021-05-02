package inheritance;

//Polimorphism: çok biçimlilik

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert: toplu ekleme
	//her müþteri türü için farklý farklý logicleri çalýþtýrmýþ olduk.
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}	
	}
}

//SOLID - Open Closed Principle: sisteme yeni özellik eklendiðinde mevcutta bulunan hiçbir kodu deðiþtiremezsin!