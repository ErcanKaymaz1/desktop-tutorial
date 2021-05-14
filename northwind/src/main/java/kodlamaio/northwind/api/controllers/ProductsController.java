package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.entites.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getall")
	public List<Product> getAll() {

		return this.productService.getAll();

	}
}
