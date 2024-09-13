package kz.nurbay.microservices.order.repository;

import kz.nurbay.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
