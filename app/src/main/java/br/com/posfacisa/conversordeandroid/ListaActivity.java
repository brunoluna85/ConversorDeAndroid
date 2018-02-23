package br.com.posfacisa.conversordeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListaActivity extends AppCompatActivity {

    private ListView listaItens;
    private String[] itens = {"Maçã", "Pera", "Abacaxi", "Melancia", "Banana"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listaItens = (ListView) findViewById(R.id.listViewLista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens);

        listaItens.setAdapter(adaptador);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), listaItens.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
