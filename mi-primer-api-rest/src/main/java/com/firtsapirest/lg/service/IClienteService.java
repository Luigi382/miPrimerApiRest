package com.firtsapirest.lg.service;

import com.firtsapirest.lg.model.dto.ClienteDto;
import com.firtsapirest.lg.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAll();

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

    boolean existsById(Integer id);
}
