package dk.kea.adventureproject.controllers;

import dk.kea.adventureproject.models.Product;
import dk.kea.adventureproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import dk.kea.adventureproject.models.Booking;
import dk.kea.adventureproject.models.Product;
import dk.kea.adventureproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Joachim & Christian
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/createProduct")
    public String createProduct() {
        return "/createProduct";
    }

    @PostMapping("/createProduct")
    public String createProduct(@ModelAttribute Product product) {
        productService.createProduct(product);
        return "redirect:/product";
    }
    @Autowired
    ProductService productService;

    //Frederik
    @GetMapping("/updateProduct/{productID}")
    public String updateProduct(@PathVariable("productID") int productID, Model model) {
        model.addAttribute("product", productService.readProductByID(productID));
        return "/updateActivity";
    }

    //Frederik
    @PostMapping("updateProduct")
    public String updateProduct(@ModelAttribute Product product) {
        productService.updateProduct(product.getProductID(), product);
        return "redirect:/";
    }
}
