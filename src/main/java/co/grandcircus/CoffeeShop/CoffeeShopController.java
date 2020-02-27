package co.grandcircus.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop.daocust.CustomerDao;
import co.grandcircus.CoffeeShop.daocust.CustomerRepository;
import co.grandcircus.CoffeeShop.daoprod.ProductDao;
import co.grandcircus.CoffeeShop.daoprod.ProductRepository;
import co.grandcircus.CoffeeShop.entitycust.Customer;
import co.grandcircus.CoffeeShop.entitycust.UserPreferences;
import co.grandcircus.CoffeeShop.entityprod.Product;

@Controller
public class CoffeeShopController {
	static private String password = "Swordfish";
	static private String entry = "";

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ProductDao productDao;

	@Autowired
	private ProductRepository productRep;
	
	@Autowired
	private CustomerRepository custRep;
	
	
	
	@RequestMapping("/")
	public ModelAndView home(@SessionAttribute(name="preferences", required=false)
	UserPreferences userPref) {
		ModelAndView mav = new ModelAndView("home");
		if(userPref!=null) {
			mav.addObject("favName", userPref.getFavName());
			mav.addObject("favPrice", userPref.getFavPrice());
		}
		mav.addObject("products", productRep.findAll());
		entry="";
		return mav;
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mav=new ModelAndView("custRegister");
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

	
	@RequestMapping("/gate")
	public ModelAndView gate() {
		ModelAndView mav = new ModelAndView("gate");
		return mav;
	}

	@RequestMapping("/gateKeep")
	public ModelAndView gateKeep(@RequestParam("pass") String entry) {
		this.entry=entry;
		ModelAndView mavAd = new ModelAndView("redirect:/admin");
		ModelAndView mavDeny = new ModelAndView("deny");
		if (entry.equals(password)) {
			return mavAd;
		} else {
			return mavDeny;
		}
	}

	@RequestMapping("/admin")
	public ModelAndView admin() {
		if (entry.equals(password)) {
			ModelAndView mav = new ModelAndView("admin");
			mav.addObject("products", productRep.findAll());
			return mav;
		} else {
			ModelAndView mavGate = new ModelAndView("/deny");
			return mavGate;
		}

	}

	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("id") Long id) {
		if (entry.equals(password)) {
			ModelAndView mav = new ModelAndView("edit");
			mav.addObject("product", productRep.findById(id).orElse(null));
			mav.addObject("title", "Edit Product");
			return mav;
		} else {
			ModelAndView mavGate = new ModelAndView("/deny");
			return mavGate;
		}
		
		
	}

	@PostMapping("/saveEdit")
	public ModelAndView saveEdit(Product product) {
		productRep.save(product);
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/add")
	public ModelAndView add() {
		if (entry.equals(password)) {
			ModelAndView mav = new ModelAndView("add");
			return mav;
		} else {
			ModelAndView mavGate = new ModelAndView("/deny");
			return mavGate;
		}
	}

	@RequestMapping("/saveAdd")
	public ModelAndView saveAdd(Product product) {
		productRep.save(product);
		ModelAndView mav = new ModelAndView("redirect:/admin");
		return mav;
	}

	@RequestMapping("/remove")
	public ModelAndView removeCheck(@RequestParam("id") Long id) {
		if (entry.equals(password)) {
			ModelAndView mav = new ModelAndView("removeCheck");
			mav.addObject("product", productRep.findById(id).orElse(null));
			return mav;
		} else {
			ModelAndView mavGate = new ModelAndView("/deny");
			return mavGate;
		}
		
	}

	@PostMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("redirect:/admin");
		productRep.deleteById(id);
		return mav;
	}
	

	


}
