package dk.kea.adventureproject.repositories;

import dk.kea.adventureproject.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Julius Panduro
 */
@Repository
public class ProductRepository {
    @Autowired
    JdbcTemplate template;
    //Template for ProductRepository

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



    //Alexander
    public void deleteProduct(int productID){
        String sql = "delete from products where productID = ?";
        template.update(sql, productID);
    }


}