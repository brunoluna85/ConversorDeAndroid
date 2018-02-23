package br.com.posfacisa.conversordeandroid.pageObject;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.robotium.solo.Solo;

import br.com.posfacisa.conversordeandroid.R;

/**
 * Created by bruno on 23/02/2018.
 */

public class CheckboxPageObject {

    private Solo solo;

    private TextView textViewEscolhas;
    private CheckBox checkboxCachorro;
    private CheckBox checkboxGato;
    private CheckBox checkboxIrmao;
    private Button buttonEscolher;

    public CheckboxPageObject(Solo solo){
        this.solo = solo;
        updateCampos();
    }

    private void updateCampos() {
        textViewEscolhas = (TextView) solo.getView(R.id.textViewEscolhas);
        checkboxCachorro = (CheckBox) solo.getView(R.id.checkBoxCachorro);
        checkboxGato = (CheckBox) solo.getView(R.id.checkBoxGato);
        checkboxIrmao = (CheckBox) solo.getView(R.id.checkBoxIrmao);
        buttonEscolher = (Button) solo.getView(R.id.buttonEscolher);
    }


    public String getTextoEscolhas() {
        updateCampos();
        return textViewEscolhas.getText().toString();
    }

    public void clicarCheckboxCachorro() {
        solo.clickOnView(checkboxCachorro);
    }

    public void clicarCheckboxGato() {
        solo.clickOnView(checkboxGato);
    }

    public void clicarCheckboxIrmao() {
        solo.clickOnView(checkboxIrmao);
    }

    public void clicarBotaoEscolher(){
        solo.clickOnView(buttonEscolher);
    }
}
