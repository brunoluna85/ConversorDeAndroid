package br.com.posfacisa.conversordeandroid.models;

import java.util.ArrayList;
import java.util.List;

import br.com.posfacisa.conversordeandroid.exception.PessoaExistenteException;

/**
 * Created by Bruno Ribeiro on 22/02/2018.
 */

public class Logador {

    private static List<Pessoa> listaDeUsuarios = new ArrayList<Pessoa>();

    public static void add(Pessoa pessoa) throws PessoaExistenteException{
        if (logar(pessoa.getUsername(), pessoa.getSenha()))
            throw new PessoaExistenteException();
        else
            listaDeUsuarios.add(pessoa);
    }

    public static boolean logar(String username, String senha){
        for (Pessoa pessoa: listaDeUsuarios) {
            boolean isValid = pessoa.isSenhaValidLogin(username, senha);
            if (isValid)
                return true;
        }
        return false;
    }

    protected static List<Pessoa> getListaDeUsuarios() {
        return listaDeUsuarios;
    }
}
