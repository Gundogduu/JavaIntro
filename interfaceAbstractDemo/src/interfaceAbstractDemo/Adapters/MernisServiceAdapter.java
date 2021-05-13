package interfaceAbstractDemo.Adapters;


import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException exception) {
			System.out.println("hata blogu �al��t�");
			exception.printStackTrace();
		} catch (RemoteException exception) {
			exception.printStackTrace();
		}
		return false;
	}
}

//tc numaras�n� long'a �evirmek gerekti, "Long.parseLong" u kulland�k. C# da "Convert.ToInt64" kullanm��t�k.

