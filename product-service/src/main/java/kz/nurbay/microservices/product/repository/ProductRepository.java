package kz.nurbay.microservices.product.repository;

import kz.nurbay.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
