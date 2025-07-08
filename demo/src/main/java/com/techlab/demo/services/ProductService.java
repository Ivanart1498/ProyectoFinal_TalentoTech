package com.techlab.demo.services;



import com.techlab.demo.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService implements IProductService{

    private List<Producto> productos = new ArrayList<Producto>();
    private int contadorId = 1;

    @Override
    public List<Producto> Listar(){
        return productos;
    }

    @Override
    public String save (Producto p){
        p.setId(contadorId++);
        p.setNombre(p.getNombre());
        p.setCategoria(p.getCategoria());
        p.setPrecio(p.getPrecio());
        p.setUsuario(p.getUsuario());
        productos.add(p);
        return "producto creado correctamente.";
    }

    @Override
    public Producto findId(Long Id) {

        if(Id >= 0 && Id < productos.size()) return productos.get(Id.byteValue());
        else return null;
    }

    @Override
    public String delete(Long Id){

        if(Id >= 0 && Id < productos.size()){

            productos.remove(Id.byteValue());
            return "Elemento eliminado correctamente";
        } else return "Elemento no encontrado.";
    }

    @Override
    public String update(Long Id) {

        Producto pr = findId(Id);

        if (pr.getId() >= 0 && pr.getId() < productos.size()) {

            pr.setNombre(pr.getNombre());
            pr.setCategoria(pr.getCategoria());
            pr.setPrecio(pr.getPrecio());
            pr.setUsuario(pr.getUsuario());

            productos.set(pr.getId(), pr);

            return "Elemento actualizado correctamente";
        } return "Elemento no encontrado.";

    }


}
