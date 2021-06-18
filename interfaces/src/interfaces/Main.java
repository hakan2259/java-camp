package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {
				new SmsLogger(),
				new DatabaseLogger(),
				new FileLogger()
		};
				
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer1 = new Customer(1,"Hakan","Sandal");
		customerManager.add(customer1);
		
	}

}
