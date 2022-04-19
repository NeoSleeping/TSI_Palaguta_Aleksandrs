package lv.tsi.webshop.resource;

import lombok.RequiredArgsConstructor;
import lv.tsi.webshop.models.Product;
import lv.tsi.webshop.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductService productService;

    @RequestMapping("/all")
    public ResponseEntity<List<Product>> getProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
