package com.co.spring.boot.backend.apirest.models.entity;

import com.co.spring.boot.backend.apirest.models.Constantes;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    @NotEmpty( message = Constantes.VACIO)
    @Size(min = 3, max = 13, message = "debe ser entre 3 y 12 caracteres")
    @Column(nullable = false, length = 50)
    private String nombre;
}
