package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	}
}
//her yerde ayrý ayrý bu döngüyü yazmak yerine Util/Araç görevi gören kodlarý metot haline çevirip istediðimiz yerde çaðýracaðýz.CustomerManager'da uyguladýk.
//     for(Logger logger: loggers) {
//	      logger.log(customer.getFirstName());
//     }