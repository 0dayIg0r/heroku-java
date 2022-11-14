package org.senai.prjjava.controller;

// import java.util.Optional;

import org.senai.prjjava.entity.Product;
import org.senai.prjjava.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8080/api/usuario/add?nome=luiz&email=luiz@gmail.com -- nesse exemplo são usadas váriaveis de parametro chave=valor

@Controller
@RequestMapping(path = "/api/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    ProductRepository pRepository;

    @RequestMapping(path = "create")
    public @ResponseBody String createProduct(@RequestParam String name, @RequestParam String  description, @RequestParam String price){
        Product  p = new Product();

        p.setName(name);
        p.setDescription(description);
        p.setPrice(price);
        pRepository.save(p);

        return "Created";
    }




    @GetMapping("/all")
    public @ResponseBody Iterable<Product> getAllUsers(){
        return pRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteProduct(@PathVariable Integer id) {
       pRepository.deleteById(id);
        return "Deleted";
    }


                                                      
}
