package br.com.posfacisa.conversordeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends AppCompatActivity {

    private Button buttonTemperatura;
    private Button buttonComprimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //criando objetos dos elementos da tela
        buttonTemperatura = (Button) findViewById(R.id.buttonTemperatura);
        buttonComprimento = (Button) findViewById(R.id.buttonComprimento);

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
    }
}
