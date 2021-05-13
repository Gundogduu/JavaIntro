package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
}

//c# daki base.save() iþlemini burada super.save() ile yaptýk.