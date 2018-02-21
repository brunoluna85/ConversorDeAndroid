package br.com.posfacisa.conversordeandroid;

import android.widget.TextView;

/**
 * Created by Bruno Ribeiro on 21/02/2018.
 */

public class TelaUtil {

    public static void switchText(TextView origem, TextView destino){
        String nomeOrigem = origem.getText().toString();
        String nomeDestino = destino.getText().toString();

        origem.setText(nomeDestino);
        destino.setText(nomeOrigem);
    }
}
