package interfaces;

public class CustomerManager {

	private Logger[] loggers;
	
	
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delet(Customer customer) {
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
