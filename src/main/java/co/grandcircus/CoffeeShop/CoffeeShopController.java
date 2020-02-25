package co.grandcircus.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop.daocust.CustomerDao;
import co.grandcircus.CoffeeShop.daoprod.ProductDao;
import co.grandcircus.CoffeeShop.entitycust.Customer;
import co.grandcircus.CoffeeShop.entityprod.Product;

@Controller
public class CoffeeShopController {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		List<Product> menu = productDao.findAll();
		mav.addObject("products", menu);
		return mav;
	}

	@RequestMapping("/register")
	public ModelAndView custReg() {
		ModelAndView mav = new ModelAndView("custRegister");
		return mav;
	}

	@PostMapping("/isReg")
	public ModelAndView custIsReg(Customer customer) {
		customerDao.create(customer);
		ModelAndView mav = new ModelAndView("isReg");
		mav.addObject("first", customer.getFirst_Name());
		mav.addObject("last", customer.getLast_Name());
		mav.addObject("phone", customer.getPhone());
		mav.addObject("email", customer.getEmail());
		return mav;
	}

	@RequestMapping("/search")
	public ModelAndView search() {
		ModelAndView mav = new ModelAndView("searcher");
		return mav;
	}

	@RequestMapping("/nameSearch")
	public ModelAndView searchName(@RequestParam(value = "name") String name) {
		ModelAndView mav = new ModelAndView("searchResult");
		List<Product> products = productDao.findByName(name);
		mav.addObject("products", products);

		return mav;
	}

	@RequestMapping("/typeSearch")
	public ModelAndView searchType(@RequestParam(value = "type") String type) {
		List<Product> products = productDao.findByType(type);
		ModelAndView mav = new ModelAndView("searchResult");
		mav.addObject("products", products);
		return mav;
	}
}
