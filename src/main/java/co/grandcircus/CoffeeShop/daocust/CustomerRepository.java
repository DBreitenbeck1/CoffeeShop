package co.grandcircus.CoffeeShop.daocust;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.CoffeeShop.entitycust.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
