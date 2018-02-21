package br.com.posfacisa.conversordeandroid.pageObject;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;
import br.com.posfacisa.conversordeandroid.R;

/**
 * Created by Bruno Ribeiro on 21/02/2018.
 */

public class ComprimentoPageObject {

    private Solo solo;

    private EditText editTextOrigem;
    private EditText editTextDestino;
    private Button buttonInverter;
    private Button buttonConverter;

    public ComprimentoPageObject(Solo soloRef){
        this.solo = soloRef;
        initCampos();
    }

    private void initCampos() {
        editTextOrigem = (EditText) solo.getView(R.id.editTextOrigemComp);
        editTextDestino = (EditText) solo.getView(R.id.editTextDestinoComp);
        buttonConverter = (Button) solo.getView(R.id.buttonConverterComp);
        buttonInverter = (Button) solo.getView(R.id.buttonInverterComp);
    }


    public void preencherOrigem(String valor) {
        solo.typeText(editTextOrigem, valor);
    }

    public void clickBotaoConverter() {
        solo.clickOnView(buttonConverter);
    }

    public String pegarValorDestino() {
        initCampos();
        return editTextDestino.getText().toString();
    }

    public void clickBotaoInverter() {
        solo.clickOnView(buttonInverter);
    }
}
