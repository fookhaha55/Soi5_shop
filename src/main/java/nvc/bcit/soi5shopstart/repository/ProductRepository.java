package nvc.bcit.soi5shopstart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.soi5shopstart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameContaining(String name);

    List<Product> findByPriceLessThanEqual(double price);

    List<Product> findByUnitInStockGreaterThan(int unit);
}
