package com.techlab.demo.controller;


import com.techlab.demo.entity.Pedido;
import com.techlab.demo.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/listPedido")
    public List<Pedido> listarPedido(){
        return pedidoService.Listar();
    }

    @PostMapping("/create")
    public Pedido crearPedido(@RequestBody Pedido pedido){
        return pedidoService.savePed(pedido);
    }

    @GetMapping("/find/{id}")
    public Pedido buscarPedido(@PathVariable Long id){
        return pedidoService.findPed(id);
    }




}
