package br.com.posfacisa.conversordeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckboxActivity extends AppCompatActivity {

    private CheckBox checkboxCachorro;
    private CheckBox checkboxGato;
    private CheckBox checkboxIrmao;
    private Button buttonEscolher;
    private TextView textViewEscolhas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        criarItensDaTela();

        buttonEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = "";
                if (checkboxCachorro.isChecked())
                    texto += checkboxCachorro.getText().toString() + " ";
                if (checkboxGato.isChecked())
                    texto += checkboxGato.getText().toString() + " ";
                if (checkboxIrmao.isChecked())
                    texto += checkboxIrmao.getText().toString();

                textViewEscolhas.setText(texto);
            }
        });

    }

    private void criarItensDaTela() {
        checkboxCachorro = (CheckBox) findViewById(R.id.checkBoxCachorro);
        checkboxGato = (CheckBox) findViewById(R.id.checkBoxGato);
        checkboxIrmao = (CheckBox) findViewById(R.id.checkBoxIrmao);
        buttonEscolher = (Button) findViewById(R.id.buttonEscolher);
        textViewEscolhas = (TextView) findViewById(R.id.textViewEscolhas);
    }
}
