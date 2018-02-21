package br.com.posfacisa.conversordeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import br.com.posfacisa.conversordeandroid.models.Conversor;

public class TemperaturaActivity extends AppCompatActivity {

    private Button buttonInverter;
    private Button buttonConverter;
    private TextView textViewOrigem;
    private TextView textViewDestino;
    private EditText editTextDestino;
    private EditText editTextOrigem;

    private DecimalFormat formatador = new DecimalFormat("0.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        //criando objetos dos elementos da tela
        textViewOrigem = (TextView) findViewById(R.id.textViewOrigemTemp);
        textViewDestino = (TextView) findViewById(R.id.textViewDestinoTemp);
        buttonInverter = (Button) findViewById(R.id.buttonInverterTemp);
        buttonConverter = (Button) findViewById(R.id.buttonConverterTemp);
        editTextOrigem = (EditText) findViewById(R.id.editTextOrigemTemp);
        editTextDestino = (EditText) findViewById(R.id.editTextDestinoTemp);

        //criando listeners dos botões

        buttonInverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaUtil.switchText(textViewOrigem,textViewDestino);
                editTextDestino.setText("");
            }
        });

        buttonConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double valor = Double.valueOf(editTextOrigem.getText().toString()); //NumberFormatException
                    double resultado;
                    if (textViewOrigem.getText().toString().equals("Celsius"))
                        resultado = (new Conversor()).celsiusToFahrenheit(valor);
                    else
                        resultado = (new Conversor()).fahrenheitToCelsius(valor);
                    editTextDestino.setText(formatador.format(resultado));
                }catch(NumberFormatException ex){
                    Toast.makeText(getApplicationContext(), "Campo vazio!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
