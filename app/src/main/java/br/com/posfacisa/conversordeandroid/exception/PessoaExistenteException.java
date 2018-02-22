package br.com.posfacisa.conversordeandroid.exception;

/**
 * Created by bruno on 22/02/2018.
 */

public class PessoaExistenteException extends Exception {
    public PessoaExistenteException(){
        super("Pessoa já existe");
    }
}
