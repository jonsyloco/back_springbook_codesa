package com.co.spring.boot.backend.apirest.models.dao;

import com.co.spring.boot.backend.apirest.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUsuarioDao  extends JpaRepository<Usuario,Long> {
    @Query(value = "SELECT * FROM usuario m WHERE m.id_usuario = :id", nativeQuery = true)
    Usuario buscarUsuarioId(@Param("id") Long id);

    @Query(value = "SELECT * FROM Usuario m inner join Rol r on (m.id_rol = r.id_rol)  WHERE m.nombre LIKE %:nombre%", nativeQuery = true)
    List<Usuario> buscarUsuarioNombre(@Param("nombre") String nombre);

}
