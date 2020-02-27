package co.grandcircus.CoffeeShop.daoprod;

import org.springframework.data.jpa.repository.JpaRepository;


import co.grandcircus.CoffeeShop.entityprod.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	


}
