package com.techlab.demo.controller;

import com.techlab.demo.entity.Usuario;
import com.techlab.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UserController {

    UserService userService;

    @GetMapping("/list")
    public List<Usuario> listaUsuario(){
        return userService.ListarUs();
    }

    @PostMapping("/registrar")
    public String crearUsuario (@RequestBody Usuario usuario){
        return userService.registrar(usuario);
    }

    @GetMapping("/find")
    public String buscaUsuario (@RequestParam String nombre){
        return "buscando " + nombre;
    }

    @DeleteMapping("/deleteUser")
    public String eliminarUsuario (@RequestParam String mail){
        return userService.eliminar(mail);
    }

}
