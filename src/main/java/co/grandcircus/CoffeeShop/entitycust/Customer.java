package co.grandcircus.CoffeeShop.entitycust;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String Phone;
	private String Password;
	
	public Customer() {
		
	}
	
	public Customer(String fname, String lname, String email, String phone, String password) {
		this.First_Name=fname;
		this.Last_Name=lname;
		this.Email=email;
		this.Phone=phone;
		this.Password=password;
				
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	
}
