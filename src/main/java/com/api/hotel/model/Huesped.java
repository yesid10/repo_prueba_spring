package com.api.hotel.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="huesped")
@Getter @Setter
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHuesped;

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<>();
}
