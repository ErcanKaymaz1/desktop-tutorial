package kodlamaio.northwind.bussiness.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entites.concretes.Product;


@Service
public class ProductManager implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	


	@Override
	public List<Product> getAll() {
		
		
		return this.productDao.findAll();
	}

}
