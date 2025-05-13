package com.cadastro.Service;

import java.util.List;
import java.util.Optional;

import com.cadastro.Entity.Usuario;
import com.cadastro.dto.UsuarioDTO;

public interface UsuarioService {
    
    //salvar usuario
    Usuario cadastrarUsuario(UsuarioDTO usuarioDTO);

    //listar todos os usuarios
    List<Usuario> listarUsuario();

    //buscar por id
    Optional<Usuario> buscarPorId(Long id);

    //atualizar usuario
    Usuario atualizarUsuario(Long id, UsuarioDTO usuarioDTO);

    //remover usuario
    void deletarUsuario(Long id);
}
