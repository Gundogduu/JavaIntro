package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

//gev�ek ba��ml� yap� - dependency injection
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
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
		}

		this.productDao.add(product);
//tamamen ba��ml� yap�
//		HibernateProductDao dao = new HibernateProductDao();
//		dao.add(product);
		this.loggerService.logToSystem("�r�n eklendi: " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

//note: d�� servisi enjekte ederken new'lersen veya Interface'i varsa ve sen onu constructor ile enjekte edersen ona ba��ml� olursun. D�� d�nyan�n interface'ini kullanmamal�s�n.
//onun yerine bir loggerManager class olu�turup, m�etodunda d�� d�nyan�n class�n� new'leyip veya dependency injection ile kullanabilirsin. �rne�ini yapt�k.