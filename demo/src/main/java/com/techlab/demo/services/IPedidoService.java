package com.techlab.demo.services;

import com.techlab.demo.entity.Pedido;

import java.util.List;

public interface IPedidoService {

    public Pedido savePed (Pedido pedido);
    public List<Pedido> Listar();
    public Pedido findPed(Long Id);
}
