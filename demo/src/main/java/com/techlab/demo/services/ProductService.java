package com.techlab.demo.services;



import com.techlab.demo.entity.Producto;
import com.techlab.demo.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService implements IProductService{

    private final ProductoRepository repoProd;

    public ProductService(ProductoRepository repo) {
        this.repoProd = repo;
    }

    @Override
    public List<Producto> Listar(){
        return repoProd.findAll();
    }

    @Override
    public String save (Producto p){
       repoProd.save(p);
       return "¡Producto creado correctamente!";
    }

    @Override
    public Producto findId(Long Id) {

        return repoProd.findById(Id).orElse(null);
    }

    @Override
    public String delete(Long Id){

        if (repoProd.existsById(Id)) {
            repoProd.deleteById(Id);
            return "Producto eliminado correctamente";
        }
        return "Producto no encontrado";
    }

    @Override
    public String update(Long Id, Producto producto) {

        return repoProd.findById(Id).map(p -> {
            p.setNombre(producto.getNombre());
            p.setPrecio(producto.getPrecio());
            repoProd.save(p);
            return "Producto actualizado correctamente";
        }).orElse("Producto no encontrado");

    }


}
