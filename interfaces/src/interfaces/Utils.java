package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	}
}
//her yerde ayr� ayr� bu d�ng�y� yazmak yerine Util/Ara� g�revi g�ren kodlar� metot haline �evirip istedi�imiz yerde �a��raca��z.CustomerManager'da uygulad�k.
//     for(Logger logger: loggers) {
//	      logger.log(customer.getFirstName());
//     }