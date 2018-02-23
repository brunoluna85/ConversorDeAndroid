package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import br.com.posfacisa.conversordeandroid.pageObject.CheckboxPageObject;

/**
 * Created by bruno on 23/02/2018.
 */

public class CheckboxRobotiumTest extends ActivityInstrumentationTestCase2<CheckboxActivity>{

    private Solo solo;
    private CheckboxPageObject checkboxPage;

    public CheckboxRobotiumTest(){
        super(CheckboxActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        checkboxPage = new CheckboxPageObject(solo);
    }

    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testNenhumClique() throws Exception{
        boolean isEmpty = checkboxPage.getTextoEscolhas().equals("");
        assertTrue("Campo não está vazio, ",isEmpty);
    }

    public void testMarqueApenasCachorro() throws Exception{
        checkboxPage.clicarCheckboxCachorro();
        checkboxPage.clicarBotaoEscolher();
        String resultado = checkboxPage.getTextoEscolhas().toString().trim();
        String expected = ("Cachorro");
        assertEquals(expected, resultado);
    }

    public void testMarqueApenasGato() throws Exception{
        checkboxPage.clicarCheckboxGato();
        checkboxPage.clicarBotaoEscolher();
        String resultado = checkboxPage.getTextoEscolhas().toString().trim();
        String expected = ("Gato");
        assertEquals(expected, resultado);
    }

    public void testMarqueApenasIrmao() throws Exception{
        checkboxPage.clicarCheckboxIrmao();
        checkboxPage.clicarBotaoEscolher();
        String resultado = checkboxPage.getTextoEscolhas().toString().trim();
        String expected = ("Irmao");
        assertEquals(expected, resultado);
    }

    public void testMarqueCachorroGato() throws Exception{
        checkboxPage.clicarCheckboxCachorro();
        checkboxPage.clicarCheckboxGato();
        checkboxPage.clicarBotaoEscolher();
        String resultado = checkboxPage.getTextoEscolhas().toString().trim();
        String expected = ("Cachorro Gato");
        assertEquals(expected, resultado);
    }

    public void testMarqueCachorroIrmao() throws Exception{
        checkboxPage.clicarCheckboxCachorro();
        checkboxPage.clicarCheckboxIrmao();
        checkboxPage.clicarBotaoEscolher();
        String resultado = checkboxPage.getTextoEscolhas().toString().trim();
        String expected = ("Cachorro Irmao");
        assertEquals(expected, resultado);
    }

    public void testMarqueGatoIrmao() throws Exception{
        checkboxPage.clicarCheckboxGato();
        checkboxPage.clicarCheckboxIrmao();
        checkboxPage.clicarBotaoEscolher();
        String resultado = checkboxPage.getTextoEscolhas().toString().trim();
        String expected = ("Gato Irmao");
        assertEquals(expected, resultado);
    }

    public void testMarqueTodos() throws Exception{
        checkboxPage.clicarCheckboxCachorro();
        checkboxPage.clicarCheckboxGato();
        checkboxPage.clicarCheckboxIrmao();
        checkboxPage.clicarBotaoEscolher();
        String resultado = checkboxPage.getTextoEscolhas().toString().trim();
        String expected = ("Cachorro Gato Irmao");
        assertEquals(expected, resultado);
    }
}
