package nLayeredDemo.jLogger;


public class JLoggerManager {
	public void log(String message) {
		System.out.println("J Logger ile loglandý. " + message);
	}
}

//MICRO SERVICE enjekte etme örneði...
//note: microservis mimarileri'de aynen bu mantýkla sisteme enjekte edilir.
//note: JLogger'daki j javayý temsil eder ve javada bir isimlendirme standardý JLogger,JAspect,JReository gibi ileride göreceðiz "Maven" ile birlikte..
