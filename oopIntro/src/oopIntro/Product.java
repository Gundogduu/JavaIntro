package oopIntro;

public class Product {
	
	//constructor
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	//overloading:a��r� y�kleme
	//constructor'daki parametrelerin Product class'�ndaki attribute'lerle bir ba�lant�s� yoktu.Ama "this" ile e�le�tirdik.
	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
