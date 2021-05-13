package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product1 = new Product();
		product1.price = 10;
		product1.name = "Mouse";

		manager.add(product1);
		
		//yapýcý blok denemesi
		ProductValidator validator = new ProductValidator();
		
		//inner class denemesi
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();
	}

}