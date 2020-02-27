package co.grandcircus.CoffeeShop;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop.daoprod.ProductRepository;
import co.grandcircus.CoffeeShop.entitycust.UserPreferences;
import co.grandcircus.CoffeeShop.entityprod.Product;

@Controller
public class SessionsController {

	@Autowired
	private HttpSession ses;
	
	@Autowired
	private ProductRepository productRep;

	@PostMapping("/fav")
	public ModelAndView setPreferences(@RequestParam Long id, UserPreferences pref) {
		Product product= productRep.getOne(id);
		pref.setFavName(product.getName());
		pref.setFavPrice(product.getPrice());
		pref.setFavType(product.getType());
		ses.setAttribute("preferences", pref);
		return new ModelAndView("redirect:/");
	}
	
	@PostMapping("/clear")
	public ModelAndView clearPreferences() {
		UserPreferences pref = new UserPreferences();
		ses.setAttribute("preferences", pref);
		return new ModelAndView("redirect:/");
	}
	
	
}
