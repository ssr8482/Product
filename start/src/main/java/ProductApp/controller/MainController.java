package ProductApp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import ProductApp.dao.ProductDao;
import ProductApp.entities.Product;

@Controller
public class MainController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = productDao.getProducts();
		
	
		return "index";
	}
	
	
	@RequestMapping("/add")
	public String addProduct() {
		
		
		return "AddProduct";
	}
	
	//redirecting to homepage after successfull data entry
	@RequestMapping(value = "/handleproduct",method = RequestMethod.POST)
	public RedirectView  handle(@ModelAttribute Product product,HttpServletRequest request ){
		System.out.println(product);
		
		productDao.createUser(product);
	
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView delete(@PathVariable("productId")int productId,HttpServletRequest request) {
		this.productDao.delete(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId")int pid,Model m) {
		Product product = this.productDao.getProduct(pid);
		m.addAttribute("product",product);
		return "update_form";
	}
}
