package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		

	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
//version
//3:    Utils.runLoggers(loggers, customer.getFirstName());

//2:	Utils utils = new Utils();
//		utils.runLoggers(loggers, customer.getFirstName());

//1:	for(Logger logger: loggers) {
//			logger.log(customer.getFirstName());
//		}
//		this.logger.log(customer.getFirstName());