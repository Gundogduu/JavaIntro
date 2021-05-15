package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	}
}

//constructor ile enjekte edilebilir ama new'leseniz de sakýncalý deðil.
//dýþ servisi kendi class'ýmýzla enjekte etmiþ olduk.Bu yapýya "Adapter" deniyor.