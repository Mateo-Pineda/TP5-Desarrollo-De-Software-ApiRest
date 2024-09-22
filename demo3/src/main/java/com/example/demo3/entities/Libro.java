package com.example.demo3.entities;

import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Audited
@Table(name = "Libro")
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Fecha")
    private int fecha;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Paginas")
    private int paginas;

    @Column(name = "Autor")
    private String autor;

}