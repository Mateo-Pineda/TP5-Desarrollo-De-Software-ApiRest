package com.example.demo3.entities;

import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Audited
@Table(name = "Domicilio")
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Calle")
    private String Calle;

    @Column(name = "Número")
    private int numero;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Localidad")
    private Localidad localidad;

    public Domicilio() {
    }

    public Domicilio(String calle, int numero, Localidad localidad) {
        Calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    public Domicilio(String calle, int numero) {
        Calle = calle;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}