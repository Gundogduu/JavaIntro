package inheritance;

//Polimorphism: �ok bi�imlilik

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert: toplu ekleme
	//her m��teri t�r� i�in farkl� farkl� logicleri �al��t�rm�� olduk.
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}	
	}
}

//SOLID - Open Closed Principle: sisteme yeni �zellik eklendi�inde mevcutta bulunan hi�bir kodu de�i�tiremezsin!