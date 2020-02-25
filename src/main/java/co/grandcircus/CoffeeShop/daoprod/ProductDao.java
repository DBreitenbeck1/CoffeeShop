package co.grandcircus.CoffeeShop.daoprod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShop.entityprod.Product;

@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbc;

	public List<Product> findAll() {
		String sql = "SELECT * FROM Products";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Product.class));
	}

	public Product findById(Long id) {
		String sql = "SELECT * FROM Products WHERE id= ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Product.class), id);
	}
	
	public List<Product> findByName(String name) {
		String sql = "SELECT * FROM Products WHERE Name= ?";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Product.class), name);
	}
	
	public List<Product> findByType(String type) {
		String sql = "SELECT * FROM Products WHERE Type= ?";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Product.class), type);
	}
	

}
