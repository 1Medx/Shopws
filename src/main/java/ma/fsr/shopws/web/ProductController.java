package ma.fsr.shopws.web;

import ma.fsr.shopws.dao.ProductRepository;
import ma.fsr.shopws.entities.Product;
import ma.fsr.shopws.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
//@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable(value = "id") int productId) throws ProductNotFoundException {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));
    }

    @PostMapping("/product")
    public Product createProduct(@Validated @RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable(value = "id") int productId,
                           @Validated @RequestBody Product productDetails) throws ProductNotFoundException {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));

        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        product.setSellCount(productDetails.getSellCount());
        product.setDescription(productDetails.getDescription());
        product.setPicture(productDetails.getPicture());

        Product updatedProduct = productRepository.save(product);

        return updatedProduct;
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") int productId) throws ProductNotFoundException {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));

        productRepository.delete(product);

        return ResponseEntity.ok().build();
    }
}
