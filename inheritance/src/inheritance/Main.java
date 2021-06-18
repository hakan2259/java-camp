package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer hakan = new IndividualCustomer();
		hakan.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "67890";
		
		UnionCustomer unionCustomer = new UnionCustomer();
		unionCustomer.customerNumber = "fgghhh11";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {hakan,hepsiBurada,unionCustomer};
		
		customerManager.addMultiple(customers);
		
		
		
		
		
	
	}

}
