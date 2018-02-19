package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;

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
        solo.assertCurrentActivity("Não está na activity correta", TemperaturaActivity.class);
    }
}
