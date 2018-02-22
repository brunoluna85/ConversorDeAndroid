package br.com.posfacisa.conversordeandroid.models;

/**
 * Created by Bruno Ribeiro on 22/02/2018.
 */

public class Pessoa {
    private String username;
    private String senha;

    public Pessoa(String username, String senha){
        this.username = username;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getUsername() {
        return username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isSenhaValidLogin(String username, String senha){
        return (this.username.equals(username) && this.senha.equals(senha));
    }
}
