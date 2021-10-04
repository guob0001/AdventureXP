package dk.kea.adventureproject.controllers;

import dk.kea.adventureproject.models.Product;
import dk.kea.adventureproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Julius Panduro
 */
@Controller
public class ProductController {
    //Template For ProductController
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
