package com.techlab.demo.controller;

import com.techlab.demo.entity.Producto;
import com.techlab.demo.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    ProductService productService;

    @GetMapping("/list")
    public List<Producto> listaProductos(){
        return productService.Listar();
    }

    @PostMapping("/create")
    public String crearProductos (@RequestBody Producto prod){
        return productService.save(prod);
    }

    @GetMapping("/find/{id}")
    public Producto buscaProductos(@PathVariable Long id){
        return productService.findId(id);
    }

    @PutMapping("/update/{id}")
    public String actualizarProductos (@PathVariable Long id){
        return productService.update(id);
    }

    @DeleteMapping("/delete/{id}")
    public String borrarProductos (@PathVariable Long id){
        return productService.delete(id);
    }

}
