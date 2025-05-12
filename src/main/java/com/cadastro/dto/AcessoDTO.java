package com.cadastro.dto;

public class AcessoDTO {

    private String tipoacesso;
    private String senha;

    public AcessoDTO() {
    }

    public AcessoDTO(String tipoacesso, String senha) {
        this.tipoacesso = tipoacesso;
        this.senha = senha;
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
