package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import br.com.posfacisa.conversordeandroid.pageObject.ComprimentoPageObject;

/**
 * Created by Bruno Ribeiro on 21/02/2018.
 */

public class ComprimentoRobotiumTest extends ActivityInstrumentationTestCase2<ComprimentoActivity> {

    private Solo solo;
    private ComprimentoPageObject comprimentoPage;

    public ComprimentoRobotiumTest(){
        super(ComprimentoActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        comprimentoPage = new ComprimentoPageObject(solo);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testConvertCentimetersToInches() throws Exception{
        String valor = "100";
        String resultadoEsperado = "39.37";
        comprimentoPage.preencherOrigem(valor);
        comprimentoPage.clickBotaoConverter();
        String resultado = comprimentoPage.pegarValorDestino();
        assertEquals(resultadoEsperado, resultado);
    }
}
