package com.matias.springboot.models.services;

import com.matias.springboot.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
