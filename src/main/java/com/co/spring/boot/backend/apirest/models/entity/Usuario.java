package com.co.spring.boot.backend.apirest.models.entity;

import com.co.spring.boot.backend.apirest.models.Constantes;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotNull(message = Constantes.VACIO)
    @Column(nullable = false)
    private Integer idRol;

    @NotEmpty( message = Constantes.VACIO)
    @Size(min = 3, max = 12, message = "debe ser entre 3 y 12 caracteres")
    @Column(nullable = false, length = 50)
    private String nombre;

    @NotEmpty( message = Constantes.VACIO)
    @Size(min = 1, max = 1, message = "debe ser 1 caracter")
    @Column(nullable = false, length = 50)
    private String activo;
}
