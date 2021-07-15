package home.jurufola.boutiqueenlignespringsecurity.controllers;

import java.util.List;

import home.jurufola.boutiqueenlignespringsecurity.entities.Product;
import home.jurufola.boutiqueenlignespringsecurity.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ApiController {

    @Autowired
    StoreService storeService;

    @GetMapping("products")
    public List<Product> getAllProducts() {

        System.out.println("___________GET api/products");
        return storeService.getAllProducts();
    }
    @PostMapping("products")
    public Product createProduct(@RequestBody Product newProduct) {

        System.out.println("___________ POST api/products");
        Product savedProduct = storeService.addProduct(newProduct);
        return savedProduct;
    }
}