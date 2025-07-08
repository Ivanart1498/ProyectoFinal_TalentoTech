package com.techlab.demo.services;

import com.techlab.demo.entity.Usuario;

import java.util.List;

public interface IUserService {

    public List <Usuario> ListarUs();
    public String registrar(Usuario usuario);
    public String eliminar (String mail);
    public boolean administrador(String opcion);
    public Usuario buscarUs(String mail);
}
