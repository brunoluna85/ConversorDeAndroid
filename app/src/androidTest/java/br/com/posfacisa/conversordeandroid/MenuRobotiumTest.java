package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;

import com.robotium.solo.Solo;

/**
 * Created by bruno on 18/02/2018.
 */

public class MenuRobotiumTest extends ActivityInstrumentationTestCase2<MenuActivity> {

    private Solo solo;

    public MenuRobotiumTest(){
        super(MenuActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testAccessTemperature() throws Exception{
        solo.clickOnButton("Temperatura");
        solo.assertCurrentActivity("Não está na activity Temperatura", TemperaturaActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }

    public void testAccessComprimento() throws Exception{
        solo.clickOnButton("Comprimento");
        solo.assertCurrentActivity("Não está na activity Comprimento", ComprimentoActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }

    public void testAccessLogin() throws Exception{
        solo.clickOnButton("Login");
        solo.assertCurrentActivity("Não está na activity Login", LoginActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }

    public void testAccessLista() throws Exception{
        solo.clickOnButton("Lista");
        solo.assertCurrentActivity("Não está na activity Lista", ListaActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }

    public void testAccessCheckbox() throws Exception{
        solo.clickOnButton("Checkbox");
        solo.assertCurrentActivity("Não está na activity Checkbox", CheckboxActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }

    public void testAccessDialog() throws Exception{
        solo.clickOnButton("Dialog");
        solo.assertCurrentActivity("Não está na activity Dialog", DialogActivity.class);
        solo.sendKey(KeyEvent.KEYCODE_BACK);
        solo.assertCurrentActivity("Não está na activity Menu", MenuActivity.class);
    }
}
