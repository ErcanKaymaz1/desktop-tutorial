package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {  /// jpa reporsitorydeki parametrenin ilki ilgili class , 2. parametre ise id nin türüdür
  
	    	
	
}
