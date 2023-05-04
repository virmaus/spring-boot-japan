package com.matias.springboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.matias.springboot.models.entity.Cliente;


public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
