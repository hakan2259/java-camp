package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Monster Abra",15000,"i7 iþlemci",10); // referans olusturma, instance
		
		
		Product product2 = new Product(); 
		product2.setId(1);
		product2.setName("Acer");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(15000);
		
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Product product3 = new Product(); 
	
		
		Product[] products = {product1,product2,product3};
		System.out.println(products.length);
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Telefon");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		

	}

}
