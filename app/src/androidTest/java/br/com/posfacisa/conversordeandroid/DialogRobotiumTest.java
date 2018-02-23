package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import br.com.posfacisa.conversordeandroid.pageObject.DialogPageObject;

/**
 * Created by bruno on 23/02/2018.
 */

public class DialogRobotiumTest extends ActivityInstrumentationTestCase2<DialogActivity>{

    private Solo solo;
    private DialogPageObject dialogPage;

    public DialogRobotiumTest(){
        super(DialogActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        dialogPage = new DialogPageObject(solo);
    }

    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testNomeCorreto() throws Exception{
        String nome = "Bruno";
        dialogPage.preenchaNome(nome);
        dialogPage.clickBotaoDialog();
        assertTrue("Título não encontrado",dialogPage.buscarTextoTitulo());
        assertTrue("Corpo não encontrado",dialogPage.buscarTextoCorpo());
        dialogPage.clickDialogSim();
        assertTrue("Toast não encontrado",dialogPage.buscarTextoNomeCorreto());
    }

    public void testNomeErrado() throws Exception{
        String nome = "Bruno";
        dialogPage.preenchaNome(nome);
        dialogPage.clickBotaoDialog();
        assertTrue("Título não encontrado",dialogPage.buscarTextoTitulo());
        assertTrue("Corpo não encontrado",dialogPage.buscarTextoCorpo());
        dialogPage.clickDialogNao();
        assertTrue("Toast não encontrado",dialogPage.buscarTextoNomeErrado());
    }

}
