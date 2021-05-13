package interfaceAbstractDemo;

import java.util.Date;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.CustomerCheckManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer( 1, "Hayri", "Gündoðdu", new Date(1996,01,18), "15465568151"));
		
	}

}
