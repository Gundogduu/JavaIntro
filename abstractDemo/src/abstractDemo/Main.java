package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager manager = new CustomerManager();
		manager.baseDatabase = new SqlServerDatabaseManager();
		manager.getCustomers();

	}
}
