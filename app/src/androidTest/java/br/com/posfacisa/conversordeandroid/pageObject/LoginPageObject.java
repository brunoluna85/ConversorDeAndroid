package br.com.posfacisa.conversordeandroid.pageObject;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;

import br.com.posfacisa.conversordeandroid.R;

/**
 * Created by bruno on 22/02/2018.
 */

public class LoginPageObject {

    private Solo solo;

    private EditText editTextUsername;
    private EditText editTextSenha;
    private Button buttonLogar;
    private Button buttonCriarConta;

    public LoginPageObject(Solo soloRef){
        this.solo = soloRef;
        updateCampos();
    }

    private void updateCampos() {
        editTextUsername = (EditText) solo.getView(R.id.editTextUsername);
        editTextSenha = (EditText) solo.getView(R.id.editTextSenha);
        buttonLogar = (Button) solo.getView(R.id.buttonLogar);
        buttonCriarConta = (Button) solo.getView(R.id.buttonCriarConta);
    }


    public void preencherUsername(String username) {
        solo.enterText(editTextUsername, username);
    }

    public void preencherSenha(String senha) {
        solo.enterText(editTextSenha, senha);
    }

    public void clicarBotaoLogar() {
        solo.clickOnView(buttonLogar);
    }

    public void clicarBotaoCriarConta() {
        solo.clickOnView(buttonCriarConta);
    }
}
