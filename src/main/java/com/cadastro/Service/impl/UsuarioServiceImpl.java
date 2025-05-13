package com.cadastro.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.Entity.Acesso;
import com.cadastro.Entity.Usuario;
import com.cadastro.Repository.AcessoRepository;
import com.cadastro.Repository.UsuarioRepository;
import com.cadastro.Service.UsuarioService;
import com.cadastro.dto.UsuarioDTO;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AcessoRepository acessoRepository;

    @Override
    public Usuario cadastrarUsuario(UsuarioDTO usuarioDTO) {

        Usuario usuario = new Usuario(
                usuarioDTO.getNome(),
                usuarioDTO.getEmail(),
                usuarioDTO.getDataNascimento(),
                usuarioDTO.getSexo(),
                usuarioDTO.getCep());

        Acesso acesso = new Acesso("User", "senha123");
        usuario.setAcesso(acesso);

        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        acessoRepository.save(acesso);

        return usuarioSalvo;
    }

    @Override
    public List<Usuario> listarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarUsuario'");
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public Usuario atualizarUsuario(Long id, UsuarioDTO usuarioDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarUsuario'");
    }

    @Override
    public void deletarUsuario(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarUsuario'");
    }

}
