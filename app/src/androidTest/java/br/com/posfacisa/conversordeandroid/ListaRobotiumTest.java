package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import br.com.posfacisa.conversordeandroid.pageObject.ListaPageObject;

/**
 * Created by bruno on 23/02/2018.
 */

public class ListaRobotiumTest extends ActivityInstrumentationTestCase2<ListaActivity>{

    private Solo solo;

    private ListaPageObject listaPage;

    private String[] validacaoItens = {"Maçã", "Pera", "Abacaxi", "Melancia", "Banana"};

    public ListaRobotiumTest(){
        super(ListaActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(),getActivity());
        listaPage = new ListaPageObject(solo);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testExibicaoTodaLista() throws Exception{
        boolean isValid = false;
        for (int i = 0; i < validacaoItens.length; i++){
            isValid = listaPage.itemEstaPresenteNaPosicao(validacaoItens[i], i);
            assertTrue(validacaoItens[i]+" não encontrado",isValid);
        }
    }

    public void testCliqueTodaLista() throws Exception{
        boolean isValid = false;
        for (int i = 0; i < validacaoItens.length; i++){
            listaPage.clicarItem(i);
            assertTrue("Mensagem não exibida",solo.searchText(validacaoItens[i]));
        }
    }
}
