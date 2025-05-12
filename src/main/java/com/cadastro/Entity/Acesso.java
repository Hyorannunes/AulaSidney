package com.cadastro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Acesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String tipoacesso;
    @Column(length = 64)
    private String senha;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Acesso() {
    }

    public Acesso(String tipoacesso, String senha) {
        this.tipoacesso = tipoacesso;
        this.senha = senha;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTipoacesso() {
        return tipoacesso;
    }

    public void setTipoacesso(String tipoacesso) {
        this.tipoacesso = tipoacesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
