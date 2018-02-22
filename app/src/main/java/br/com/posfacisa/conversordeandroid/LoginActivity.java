package br.com.posfacisa.conversordeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.posfacisa.conversordeandroid.models.Logador;

public class LoginActivity extends AppCompatActivity {
    
    private EditText editTextUsername;
    private EditText editTextSenha;
    private Button buttonLogar;
    private Button buttonCriarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        criarItensDaTela();
        
        criarListeners();
    }

    private void criarItensDaTela() {
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);
        buttonLogar = (Button) findViewById(R.id.buttonLogar);
        buttonCriarConta = (Button) findViewById(R.id.buttonCriarConta);
    }

    private void criarListeners() {
        buttonLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String senha = editTextSenha.getText().toString();
                if (username.isEmpty() || senha.isEmpty())
                    Toast.makeText(getApplicationContext(), "Campo em branco", Toast.LENGTH_LONG).show();
                else{
                    boolean isValid = Logador.logar(username, senha);
                    if (isValid)
                        Toast.makeText(getApplicationContext(), "Bem vindo", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "Senha ou login incorreto", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, CriarContaActivity.class));
            }
        });
    }
}
