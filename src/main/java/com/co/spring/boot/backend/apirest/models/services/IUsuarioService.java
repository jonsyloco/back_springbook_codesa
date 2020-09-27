package com.co.spring.boot.backend.apirest.models.services;

import com.co.spring.boot.backend.apirest.models.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> findAllUsuario();

    public Page<Usuario> findAllUsuario(Pageable paginacion);

    public Usuario guardarUsuario(Usuario Usuario);

    public void eliminarUsuario(Long id);

    public Usuario buscarUsuarioPorId(Long id);

    public List<Usuario> buscarUsuarioPorNombre(String nombre);
}
