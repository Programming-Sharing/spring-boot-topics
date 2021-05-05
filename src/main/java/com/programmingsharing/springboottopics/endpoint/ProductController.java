package com.programmingsharing.springboottopics.endpoint;

import com.programmingsharing.springboottopics.domain.AddProductReq;
import com.programmingsharing.springboottopics.domain.ProductInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("product")
public class ProductController {

    @PostMapping(value = "", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> addProduct(@Valid @RequestBody AddProductReq addProductReq) {
        return new ResponseEntity<>("New product added", HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProductInfo> getProduct(@PathVariable("id") Integer productId) {
        return new ResponseEntity<ProductInfo>(new ProductInfo(1, "Demo product", "Swagger demonstration product"), HttpStatus.OK);
    }

}
