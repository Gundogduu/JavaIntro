package interfacesInTheVideo;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//iþ kodlarý
		customerDal.add();
	}
}

//kullanýcý unutabilir diye CustomerManager direkt newlenirken parametre olarak customerDal sýnýfý istemesini saðladýk.
