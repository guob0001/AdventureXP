package dk.kea.adventureproject.services;

import dk.kea.adventureproject.models.Product;
import dk.kea.adventureproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import dk.kea.adventureproject.models.Product;
import dk.kea.adventureproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Joachim og Christian
 */
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    /**
     * @author Joachim og Christian
     */

    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }



    public List<Product> fetchAll(){
        return productRepository.fetchAll();
    }

    public Product readProductById(int id){
        return productRepository.readProductById(id);
    }

    //Frederik
    public void updateProduct(int productID, Product product){
        productRepository.updateProduct(productID, product);
    }

    public void deleteProduct(int productID){
        productRepository.deleteProduct(productID);
    }


}
