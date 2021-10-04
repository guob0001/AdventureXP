package dk.kea.adventureproject.repositories;

import dk.kea.adventureproject.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dk.kea.adventureproject.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * @author Joachim & Christian
 */
public class ProductRepository {

    @Autowired
    JdbcTemplate template;

    /**
     * @author Joachim og Christian
     */

    public void createProduct(Product product) {
        String sql = "INSERT INTO products (productID, productName, productPrice) VALUES (?, ?, ?)";
        template.update(sql,
                product.getProductID(),
                product.getProductName(),
                product.getProductPrice());
    }

    public List<Product> fetchAll(){
        String sql = "SELECT * FROM products";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.query(sql, rowMapper);
    }

    //Frederik
    public void updateProduct(int productID, Product product) {
        String sql = "UPDATE products SET productName = ?, productPrice = ? WHERE productID = ?";
        template.update(sql,
                product.getProductName(),
                product.getProductPrice(),
                productID);
    }
}
