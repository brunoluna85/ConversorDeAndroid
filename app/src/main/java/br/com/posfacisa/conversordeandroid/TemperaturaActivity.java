package br.com.posfacisa.conversordeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TemperaturaActivity extends AppCompatActivity {

    private Button buttonInverter;
    private TextView textViewOrigem;
    private TextView textViewDestino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        textViewOrigem = (TextView) findViewById(R.id.textViewOrigem);
        textViewDestino = (TextView) findViewById(R.id.textViewDestino);

        buttonInverter = (Button) findViewById(R.id.buttonInverter);
        buttonInverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchText(textViewOrigem,textViewDestino);
            }
        });
    }

    private void switchText(TextView origem, TextView destino){
        String nomeOrigem = origem.getText().toString();
        String nomeDestino = destino.getText().toString();

        origem.setText(nomeDestino);
        destino.setText(nomeOrigem);
    }
}
