package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager baseDatabase;
	
	public void getCustomers() {
		baseDatabase.getData();
	}
}

//mainde kullanırken database sınıfını newleyip kullanacağız.