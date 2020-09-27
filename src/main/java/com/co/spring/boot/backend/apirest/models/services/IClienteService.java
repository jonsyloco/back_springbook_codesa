package com.co.spring.boot.backend.apirest.models.services;

import com.co.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAllClient();

    public Page<Cliente> findAllClient(Pageable paginacion);

    public Cliente guardarCliente(Cliente cliente);

    public void eliminarCliente(Long id);

    public Cliente buscarClientePorId(Long id);
}
