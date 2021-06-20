package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		// nLayeredDemo.core ->  butun projelerde kullanýlabilecek yapýlarý anlatýr.
		// core ayrý projeler olarak olusturabilir. olusturulur.
		
		//ToDo Spring IoC ile cozulecek
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product1 = new Product(1,2,"Laptop",12000,2);
		productService.add(product1);
		
		
		

	}

}
