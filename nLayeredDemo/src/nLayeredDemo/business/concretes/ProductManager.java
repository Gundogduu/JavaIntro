package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

//gevþek baðýmlý yapý - dependency injection
	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}

		this.productDao.add(product);
//tamamen baðýmlý yapý
//		HibernateProductDao dao = new HibernateProductDao();
//		dao.add(product);
		this.loggerService.logToSystem("Ürün eklendi: " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

//note: dýþ servisi enjekte ederken new'lersen veya Interface'i varsa ve sen onu constructor ile enjekte edersen ona baðýmlý olursun. Dýþ dünyanýn interface'ini kullanmamalýsýn.
//onun yerine bir loggerManager class oluþturup, möetodunda dýþ dünyanýn classýný new'leyip veya dependency injection ile kullanabilirsin. Örneðini yaptýk.