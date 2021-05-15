package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	}
}

//constructor ile enjekte edilebilir ama new'leseniz de sak�ncal� de�il.
//d�� servisi kendi class'�m�zla enjekte etmi� olduk.Bu yap�ya "Adapter" deniyor.