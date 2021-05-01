package classesWithAttributes;

public class Product {
	
	//constructor
	public Product() {
		
	}
	
	//overloading
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yap�c� blok �al��t�");
	}
	
	//attribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _kod;
	
	//getter
	public int getId() {
		return _id;
	}
	
	//setter
	//d�zenlenecek veri parametrede verilmeli!
	public void setId(int id) {
		_id = id;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getDescription() {
		return _description;
	}
	
	public void setDescription(String description) {
		_description = description;
	}
	
	public double getPrice() {
		return _price;
	}
	
	public void setPrice(double price) {
		_price = price;
	}
	
	public int getStockAmount() {
		return _stockAmount;
	}
	
	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	//sadece getter
	public String getKod() {
		return _name.substring(0,1) + _id;
	}


}

//Java'da attribute'lerin default'u "public" tir.

//"this" vermek yerine "_" alt�izgi ekleyerek birbirinden ay�rm�� olduk.�kiside kullan�labilir.

//T�m field'lar�n getter/setter i�lemini otomatik yapamad�m ECLIPSE'de!
