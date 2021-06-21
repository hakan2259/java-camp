package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

//ProductRepository
//interface - interface'i extends eder
public interface ProductDao extends JpaRepository<Product, Integer> {

	
}
