package ProductApp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import ProductApp.entities.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createUser(Product product) {
		
		this.hibernateTemplate.saveOrUpdate(product);
		
	}
	
	//all product get
	public List<Product> getProducts(){
		
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		
		return products;
		
		
	}
	
	@Transactional
	public void delete(int pid) {
		
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	//single product get
	public Product getProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		return product;
		
	}
}
