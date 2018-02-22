package br.com.posfacisa.conversordeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.posfacisa.conversordeandroid.exception.PessoaExistenteException;
import br.com.posfacisa.conversordeandroid.models.Logador;
import br.com.posfacisa.conversordeandroid.models.Pessoa;

public class CriarContaActivity extends AppCompatActivity {

    private EditText editTextUsernameCriar;
    private EditText editTextSenhaCriar;
    private EditText editTextSenhaConfirm;
    private Button buttonCriar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        criarItensDaTela();
        criarListeners();
    }

    private void criarItensDaTela() {
        editTextUsernameCriar = (EditText) findViewById(R.id.editTextUsernameCriar);
        editTextSenhaCriar = (EditText) findViewById(R.id.editTextSenhaCriar);
        editTextSenhaConfirm = (EditText) findViewById(R.id.editTextSenhaConfirm);
        buttonCriar = (Button) findViewById(R.id.buttonCriar);
    }

    private void criarListeners() {
        buttonCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsernameCriar.getText().toString();
                String senha = editTextSenhaCriar.getText().toString();
                String senha2 = editTextSenhaConfirm.getText().toString();
                if (senha.equals(senha2)){
                    try {
                        Logador.add(new Pessoa(username, senha));
                        Toast.makeText(getApplicationContext(), "Cadastrado com sucesso", Toast.LENGTH_LONG).show();
                    }catch(PessoaExistenteException e){
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Senhas diferentes", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
