package com.example.GraduationProject.PresentationLayer;


import com.example.GraduationProject.Business.Entity.Customer;
import com.example.GraduationProject.Business.Entity.Product;
import com.example.GraduationProject.Business.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class AddProductController {

    @Autowired
    ProductService prodSer;


    @GetMapping("/addproductform")
    public String signUp(Model model) {
        return "addproductform";
    }

    @PostMapping("/addproductform")
    public String submit(@RequestParam MultipartFile file, @RequestParam String description,@RequestParam int price,  @RequestParam String size, Model model) throws IOException {
    Product product = new Product(file.getBytes(),price,size,description);
       prodSer.addProductDetails(product);
        return "redirect:/addproductform";
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        Product product = prodSer.getProduct(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;")
                .body(product.getImageData());
    }
}
