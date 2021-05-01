package interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.err.println("Database loglandý :"+message);
	}

}
