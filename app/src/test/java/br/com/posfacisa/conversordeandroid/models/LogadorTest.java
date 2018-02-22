package br.com.posfacisa.conversordeandroid.models;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Bruno Ribeiro on 22/02/2018.
 */

public class LogadorTest {

    @Test
    public void testAdd() throws Exception{
        String username = "asd";
        String senha = "123";

        Logador.add(new Pessoa(username, senha));

        boolean isValid = false;
        for (Pessoa pessoa: Logador.getListaDeUsuarios()) {
            if (pessoa.getUsername().equals(username) && pessoa.getSenha().equals(senha)) {
                isValid = true;
                break;
            }
        }
        assertTrue("Usuário não foi cadastrado",isValid);
    }

    @Test
    public void testLogar() throws Exception{
        String username = "asd";
        String senha = "123";

        Logador.getListaDeUsuarios().add(new Pessoa(username, senha));

        boolean isValid = Logador.logar(username, senha);
        assertTrue("Usuário não logou",isValid);
    }
}
