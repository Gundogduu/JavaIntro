package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter() );
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}

//note: Bir projede entity'ler hariç baþka bir þeyi new'liyorsanýz anlayýn ki problem yaþayacaksýnýz.
//yukarýda test yaptýðýmýz için new'ledik. Spring IoC ile çözülecek.