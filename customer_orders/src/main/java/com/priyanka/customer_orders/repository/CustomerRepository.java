package com.priyanka.customer_orders.repository;

import com.priyanka.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Priyanka
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
