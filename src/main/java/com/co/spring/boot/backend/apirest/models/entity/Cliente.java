package com.co.spring.boot.backend.apirest.models.entity;

import com.co.spring.boot.backend.apirest.models.Constantes;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty( message = Constantes.VACIO)
    @Size(min = 3, max = 12, message = "debe ser entre 3 y 12 caracteres")
    @Column(nullable = false, length = 50)
    private String nombre;

    @NotEmpty( message = Constantes.VACIO)
    @Size(min = 4, max = 12, message = "debe ser entre 4 y 12 caracteres")
    @Column(nullable = false, length = 50)
    private String apellido;

    @NotEmpty( message = Constantes.VACIO)
    @Email(message = Constantes.EMAIL_MAL_FORMADO)
    @Size(min = 7, max = 50, message = "debe ser entre 7 y 50 caracteres")
    @Column(nullable = false, length = 255, unique = true)
    private String email;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @NotEmpty( message = Constantes.VACIO)
    @Size(min = 1, max = 3)
    @Column(nullable = false)
    private String edad;

    @Column(name = "ruta_foto")
    private String rutaFoto;
}
