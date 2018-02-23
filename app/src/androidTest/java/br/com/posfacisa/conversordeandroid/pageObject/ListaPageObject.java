package br.com.posfacisa.conversordeandroid.pageObject;

import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.ListView;

import com.robotium.solo.Solo;
import br.com.posfacisa.conversordeandroid.R;


/**
 * Created by bruno on 23/02/2018.
 */

public class ListaPageObject {

    private Solo solo;

    private ListView listViewLista;

    public ListaPageObject(Solo solo){
        this.solo = solo;
        updateCampos();
    }

    private void updateCampos() {
        listViewLista = (ListView) solo.getView(R.id.listViewLista);
    }

    public boolean itemEstaPresenteNaPosicao(String validacaoItem, int i) {
        return listViewLista.getItemAtPosition(i).toString().equals(validacaoItem);
    }

    public void clicarItem(int i) {
        solo.clickOnMenuItem(listViewLista.getAdapter().getItem(i).toString());
    }

    public String pegarItemPosicao(int i) {
        return listViewLista.getItemAtPosition(i).toString();
    }

}
