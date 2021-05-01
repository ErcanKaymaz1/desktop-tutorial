package interfaces;

public class Utils {
		
	public static void runLoggers(Logger[] loggers, String message) {

		for (Logger log : loggers) {
			log.log(message);
		}
	}
	
}
