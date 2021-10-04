package dk.kea.adventureproject.services;

import dk.kea.adventureproject.models.Product;
import dk.kea.adventureproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Julius Panduro
 */
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    //Template for ProductService

    public List<Product> fetchAll(){
        return productRepository.fetchAll();
    }
}
