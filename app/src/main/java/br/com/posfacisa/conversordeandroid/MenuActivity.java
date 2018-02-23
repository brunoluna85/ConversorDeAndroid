package br.com.posfacisa.conversordeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.posfacisa.conversordeandroid.models.Logador;
import br.com.posfacisa.conversordeandroid.models.Pessoa;


public class MenuActivity extends AppCompatActivity {

    private Button buttonTemperatura;
    private Button buttonComprimento;
    private Button buttonLogin;
    private Button buttonLista;
    private Button buttonCheckbox;
    private Button buttonSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //criando objetos dos elementos da tela
        buttonTemperatura = (Button) findViewById(R.id.buttonTemperatura);
        buttonComprimento = (Button) findViewById(R.id.buttonComprimento);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonSair = (Button) findViewById(R.id.buttonSair);
        buttonLista = (Button) findViewById(R.id.buttonLista);
        buttonCheckbox = (Button) findViewById(R.id.buttonCheckbox);

        //criando listeners dos botões da tela
        buttonTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, TemperaturaActivity.class));
            }
        });

        buttonComprimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, ComprimentoActivity.class));
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, LoginActivity.class));
            }
        });

        buttonLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, ListaActivity.class));
            }
        });

        buttonCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, CheckboxActivity.class));
            }
        });

        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
