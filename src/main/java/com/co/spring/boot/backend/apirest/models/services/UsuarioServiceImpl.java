package com.co.spring.boot.backend.apirest.models.services;

import com.co.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.co.spring.boot.backend.apirest.models.dao.IUsuarioDao;
import com.co.spring.boot.backend.apirest.models.entity.Cliente;
import com.co.spring.boot.backend.apirest.models.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    /*inyectando la dependencia del crud repository*/
    @Autowired
    IUsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAllUsuario() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public Page<Usuario> findAllUsuario(Pageable paginacion) {
        return usuarioDao.findAll(paginacion);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioDao.deleteById(id);
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioDao.buscarUsuarioId(id);

    }

    @Override
    public List<Usuario> buscarUsuarioPorNombre(String nombre) {
        return (List<Usuario>) usuarioDao.buscarUsuarioNombre(nombre);
    }
}
