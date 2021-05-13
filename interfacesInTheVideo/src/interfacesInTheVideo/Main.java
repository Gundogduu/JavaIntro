package interfacesInTheVideo;

public class Main {

	public static void main(String[] args) {
	
		CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
//		manager.customerDal = new OracleCustomerDal();
		manager.add();
	}

}

//kullanýcý unutabilir diye CustomerManager direkt newlenirken parametre olarak customerDal sýnýfý istemesini saðladýk.
//		manager.customerDal = new OracleCustomerDal();