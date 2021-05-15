package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
}

//note: isimlendirme olarak ProductRepository diye de kullan�l�yor.
//note: ArrayList'ler generic'tir. �stedi�iniz t�rde eleman� istedi�iniz kadar ekleyebilirsiniz. 
//"int[]" bu t�rdeki dizinlerde sonradan eleman ekleyemiyorduk.
//ArrayList<Product> yerine List<Product> yazd�k.Farketmiyor List, ArrayList'in base'idir.