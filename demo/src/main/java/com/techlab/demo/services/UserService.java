package com.techlab.demo.services;

import com.techlab.demo.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service

public class UserService implements IUserService{

    List <Usuario> listaUsuarios = new ArrayList<>();

    @Override
    public List<Usuario> ListarUs() {
        return listaUsuarios;
    }

    @Override
    public String registrar(Usuario us) {
        us.setNombre(us.getNombre());
        us.setApellido(us.getApellido());
        us.setMail(us.getMail());
        us.setContraseña(us.getContraseña());

        listaUsuarios.add(us);

        return "¡Usuario registrado correctamente!";
    }

    @Override
    public Usuario buscarUs(String mail) {

        for(Usuario usuario : listaUsuarios){

            if(mail.equals(usuario.getMail()))  return usuario;

        }

        return null;
    }

    @Override
    public String eliminar(String mail) {

        boolean found = false;

        Usuario us = buscarUs(mail);

        Iterator<Usuario> iterator = listaUsuarios.iterator();
        while (iterator.hasNext()) {
            Usuario u = iterator.next();
            if (u.getMail().equals(us.getMail())) {
                iterator.remove();
                found = true;
            }
        }

        if(found) return "Usuario eliminado correctamente.";
        else return "Usuario no encontrado.";
    }

    @Override
    public boolean administrador(String opcion) {



        return false;
    }


}
