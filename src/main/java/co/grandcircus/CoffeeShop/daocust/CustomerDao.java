package co.grandcircus.CoffeeShop.daocust;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShop.entitycust.Customer;



@Repository
public class CustomerDao {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public List<Customer> findAll() {
		String sql = "SELECT * FROM Customers";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Customer.class));
	}

	public Customer findById(Long id) {
	
		String sql = "SELECT * FROM Customers WHERE id= ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class), id);
		
	}

	public void update(Customer customer) {
	
		String sql = "Update Customers SET First_Name =?, "
				+ "Last_Name =?, Phone=?, Email=? WHERE id =?";
		jdbc.update(sql, customer.getFirst_Name(), customer.getLast_Name(), 
				customer.getPhone(), customer.getEmail(), customer.getId());

	}

	public void create(Customer customer) {
		String sql = "INSERT INTO Customers (First_Name, Last_Name, Phone, Email, Password) "
				+ "VALUES (?, ?, ?, ?, ?)";
		jdbc.update(sql, customer.getFirst_Name(),
				customer.getLast_Name(), customer.getPhone(), customer.getEmail(), customer.getPassword());
	}

	public void delete(Long id) {
		String sql = "DELETE FROM Room WHERE id = ?";
		jdbc.update(sql, id);
	}
	
}
