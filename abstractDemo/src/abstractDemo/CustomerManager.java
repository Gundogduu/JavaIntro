package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager baseDatabase;
	
	public void getCustomers() {
		baseDatabase.getData();
	}
}

//mainde kullan�rken database s�n�f�n� newleyip kullanaca��z.