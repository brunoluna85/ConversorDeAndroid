package br.com.posfacisa.conversordeandroid.pageObject;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;

import br.com.posfacisa.conversordeandroid.R;

/**
 * Created by bruno on 23/02/2018.
 */

public class DialogPageObject {

    private Solo solo;

    private EditText editTextNomeDialog;
    private Button buttonDialog;

    public DialogPageObject(Solo solo){
        this.solo = solo;
        updateCampos();
    }

    private void updateCampos() {
        editTextNomeDialog = (EditText) solo.getView(R.id.editTextNomeDialog);
        buttonDialog = (Button) solo.getView(R.id.buttonDialog);
    }

    public void preenchaNome(String nome) {
        solo.typeText(editTextNomeDialog, nome);
    }

    public void clickBotaoDialog() {
        solo.clickOnView(buttonDialog);
    }

    public boolean buscarTextoTitulo() {
        return solo.searchText("Nome está correto?");
    }

    public boolean buscarTextoCorpo() {
        return solo.searchText(editTextNomeDialog.getText().toString().trim());
    }

    public void clickDialogSim() {
        solo.clickOnButton("Sim");
    }

    public boolean buscarTextoNomeCorreto() {
        return solo.searchText("Obrigado");
    }

    public void clickDialogNao() {
        solo.clickOnButton("Não");
    }

    public boolean buscarTextoNomeErrado() {
        return solo.searchText("Corrija o nome");
    }
}
