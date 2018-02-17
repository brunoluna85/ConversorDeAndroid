package br.com.posfacisa.conversordeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.posfacisa.conversordeandroid.models.Conversor;

public class TemperaturaActivity extends AppCompatActivity {

    private Button buttonInverter;
    private Button buttonConverter;
    private TextView textViewOrigem;
    private TextView textViewDestino;
    private EditText editTextDestino;
    private EditText editTextOrigem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        //criando objetos dos elementos da tela
        textViewOrigem = (TextView) findViewById(R.id.textViewOrigem);
        textViewDestino = (TextView) findViewById(R.id.textViewDestino);
        buttonInverter = (Button) findViewById(R.id.buttonInverter);
        buttonConverter = (Button) findViewById(R.id.buttonConverter);
        editTextOrigem = (EditText) findViewById(R.id.editTextOrigem);
        editTextDestino = (EditText) findViewById(R.id.editTextDestino);

        //criando listeners dos botões

        buttonInverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchText(textViewOrigem,textViewDestino);
                editTextDestino.setText("");
            }
        });

        buttonConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    float valor = Float.valueOf(editTextOrigem.getText().toString()); //NumberFormatException
                    float resultado;
                    if (textViewOrigem.getText().toString().equals("Celsius"))
                        resultado = Conversor.celsiusToFahrenheit(valor);
                    else
                        resultado = Conversor.fahrenheitToCelsius(valor);
                    editTextDestino.setText(resultado+"");
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Campo vazio!", Toast.LENGTH_SHORT).show();
                }

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
