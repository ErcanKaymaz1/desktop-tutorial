package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.err.println("Sms g�nderildi : "+message );
	}

}
