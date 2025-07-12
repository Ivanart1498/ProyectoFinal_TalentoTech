package com.techlab.demo.services;

import com.techlab.demo.entity.Pedido;

import com.techlab.demo.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService implements IPedidoService{

    private final PedidoRepository pedidoRepository;

    public PedidoService (PedidoRepository repo){
        this.pedidoRepository = repo;
    }

    @Override
    public Pedido savePed(Pedido p) {
        return pedidoRepository.save(p);
    }

    @Override
    public List<Pedido> Listar() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido findPed(Long Id) {
        return pedidoRepository.findById(Id).orElse(null);
    }


}
