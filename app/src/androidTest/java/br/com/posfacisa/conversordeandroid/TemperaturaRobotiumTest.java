package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.Button;

import com.robotium.solo.Solo;

/**
 * Created by bruno on 18/02/2018.
 */

public class TemperaturaRobotiumTest extends ActivityInstrumentationTestCase2<TemperaturaActivity> {

    private Solo solo;

    public TemperaturaRobotiumTest() {
        super(TemperaturaActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testConvertCelsiusToFahrenheit() throws Exception{
        solo.enterText(0, "100");
        solo.clickOnButton("Converter");

        String resultado = solo.getEditText(1).getText().toString();

        boolean isRight = resultado.equals("212");
        assertTrue("Valor não confere: ",isRight);
    }

    public void testConvertFahrenheitToCelsius() throws Exception{
        Button buttonInverter = (Button) solo.getView("buttonInverterTemp");
        solo.clickOnView(buttonInverter);
        //solo.clickOnView(solo.getView("buttonInverter"));

        //solo.clickOnButton("Inverter");
        solo.enterText(0, "212");
        solo.clickOnButton("Converter");

        String resultado = solo.getEditText(1).getText().toString();

        boolean isRight = resultado.equals("100");
        assertTrue("Valor não confere: ",isRight);
    }
}
