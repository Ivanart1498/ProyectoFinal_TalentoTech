package com.techlab.demo.controller;

import com.techlab.demo.model.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductController {

    @GetMapping("/list")
    public String listaProductos(){
        return "Hola";
    }

    @PostMapping("/")
    public String crearProductos (@RequestBody Producto prod){
        return "Agregar producto";
    }

    @GetMapping("/find/{id}")
    public String buscaProductos(@PathVariable Long id){
        return "buscando " + id;
    }

}
