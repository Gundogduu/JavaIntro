package Adapters;

import java.rmi.RemoteException;

import Abstract.IMemberCheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IMemberCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Member member) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()), member.getFirstName(), member.getLastName(), member.getDateOfBirth().getYear());
		} catch (NumberFormatException exception) {
			exception.printStackTrace();
		} catch (RemoteException exception) {
			exception.printStackTrace();
		}
		return false;
	}
}
