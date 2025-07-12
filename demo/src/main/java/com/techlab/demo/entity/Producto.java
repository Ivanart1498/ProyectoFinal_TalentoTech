package com.techlab.demo.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nombre;
    private double precio;
    private int cantidadStock;
    private String categoria;


}
