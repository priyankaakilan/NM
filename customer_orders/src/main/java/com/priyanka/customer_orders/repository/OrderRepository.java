package com.priyanka.customer_orders.repository;

import com.priyanka.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Priyanka
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
