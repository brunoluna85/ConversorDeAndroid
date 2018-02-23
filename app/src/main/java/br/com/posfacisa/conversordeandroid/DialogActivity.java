package br.com.posfacisa.conversordeandroid;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    private EditText editTextNomeDialog;
    private Button buttonDialog;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        editTextNomeDialog = (EditText) findViewById(R.id.editTextNomeDialog);
        buttonDialog = (Button) findViewById(R.id.buttonDialog);

        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new AlertDialog.Builder(DialogActivity.this);
                dialog.setTitle("Nome está correto?");
                dialog.setMessage(editTextNomeDialog.getText().toString());
                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(DialogActivity.this, "Corrija o nome", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(DialogActivity.this, "Obrigado", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.create();
                dialog.show();
            }
        });
    }
}
