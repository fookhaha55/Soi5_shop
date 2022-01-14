package nvc.bcit.soi5shopstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.soi5shopstart.model.Product;
import nvc.bcit.soi5shopstart.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product getById(int id){
        return productRepository.getById(id);

    }

    public List<Product> findByname
    (String name){
        return productRepository.findByNameContaining(name);

    }
    public List<Product> findByPrice(double price){
        return productRepository.findByPriceLessThanEqual(price);
    }

    public List<Product> findByUnitInStock(int unit){
        return productRepository.findByUnitInStockGreaterThan(unit);
    }
}
