package br.com.posfacisa.conversordeandroid.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruno Ribeiro on 22/02/2018.
 */

public class Logador {

    private static List<Pessoa> listaDeUsuarios = new ArrayList<Pessoa>();

    public static void add(Pessoa pessoa){
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
