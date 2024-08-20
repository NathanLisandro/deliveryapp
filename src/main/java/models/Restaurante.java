package models;

import jakarta.persistence.*;
import types.Categoria;

@Table(name = "Restaurante")
public class Restaurante {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
    private int id;
    private String name;
    private Categoria category;
    private String priceRange;
    @Embedded
    private Address address;
}

