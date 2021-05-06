package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		v1
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log mesaj�");

//		v2
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for(BaseLogger logger:loggers) {
//			logger.Log("Log mesaj�");
//		}
		
//      v3
		CustomerManager manager = new CustomerManager(new EmailLogger());
		manager.add();
		
	}

}

//Bu polimorphism'i b�yle "Base" s�n�flarla ve "Interface" lerle de yapabiliyoruz.