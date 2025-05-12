package com.cadastro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
