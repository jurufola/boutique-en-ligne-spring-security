package home.jurufola.boutiqueenlignespringsecurity.services;

import home.jurufola.boutiqueenlignespringsecurity.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {
    private List<Product> products = new ArrayList<Product>();

    public StoreService() {
        addProduct(new Product(1L, "Laptop", "32Go RAM"));
        addProduct(new Product(2L, "Shoes", "For running"));
        addProduct(new Product(3L, "Cookies", "With chocolate"));
    }

    public List<Product> getAllProducts() {
        return this.products;
    }

    public Product addProduct(Product productToAdd) {
        productToAdd.setId(Long.valueOf(products.size()));
        products.add(productToAdd);
        return productToAdd;
    }
}
