package com.techlab.demo.services;

import com.techlab.demo.entity.Producto;

import java.util.List;

public interface IProductService {

    public String save (Producto producto);
    public List<Producto> Listar();
    public Producto findId(Long Id);
    public String delete(Long Id);
    public String update(Long Id);
}
