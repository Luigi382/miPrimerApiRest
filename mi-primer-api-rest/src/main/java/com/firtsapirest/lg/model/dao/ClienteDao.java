package com.firtsapirest.lg.model.dao;

import com.firtsapirest.lg.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
