package com.example.demo3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
@javax.persistence.Table(name = "Persona")
public class Persona implements Serializable {

    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @javax.persistence.Column(name = "Nombre")
    private String nombre;

    @javax.persistence.Column(name = "Apellido")
    private String apellido;

    @javax.persistence.Column(name = "DNI", unique = true)
    private int dni;
}