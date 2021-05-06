package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		v1
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log mesajý");

//		v2
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for(BaseLogger logger:loggers) {
//			logger.Log("Log mesajý");
//		}
		
//      v3
		CustomerManager manager = new CustomerManager(new EmailLogger());
		manager.add();
		
	}

}

//Bu polimorphism'i böyle "Base" sýnýflarla ve "Interface" lerle de yapabiliyoruz.