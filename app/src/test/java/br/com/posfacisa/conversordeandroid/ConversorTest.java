package br.com.posfacisa.conversordeandroid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.posfacisa.conversordeandroid.models.Conversor;

import static org.junit.Assert.*;

/**
 * Created by bruno on 17/02/2018.
 */

public class ConversorTest{

    private Conversor conversor;

    @Before
    public void setUp() throws Exception {
        conversor = new Conversor();
    }

    @After
    public void tearDown() throws Exception {
        conversor.fecharConexao();
    }

    @Test
    public void fahrenheitToCelsiusTest() throws Exception{
        double input = 212;
        double output;
        double expected = 100;
        double delta = 0.1;

        output = conversor.fahrenheitToCelsius(input);
        assertEquals(expected, output, delta);

        input = 98.6;
        output = 0;
        expected = 37;

        output = conversor.fahrenheitToCelsius(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void celsiusToFahrenheitTest() throws Exception{
        double input = 37;
        double output;
        double expected = 98.6;
        double delta = 0.1;

        output = conversor.celsiusToFahrenheit(input);
        assertEquals(expected, output, delta);

        input = 100;
        output = 0;
        expected = 212;

        output = conversor.celsiusToFahrenheit(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void centimetersToInchesTest() throws Exception{
        double input = 100;
        double output;
        double expected = 39.37;
        double delta = 0.01;

        output = conversor.centimetersToInches(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void inchesToCentimetersTest() throws Exception{
        double input = 39.37;
        double output;
        double expected = 100;
        double delta = 0.01;

        output = conversor.inchesToCentimeters(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void kgToPoundTest() throws Exception{
        double input = 10;
        double output;
        double expected = 22.04;
        double delta = 0.01;

        output = conversor.kgToPound(input);
        assertEquals(expected,output,delta);
    }

    @Test
    public void poundToKgTest() throws Exception{
        double input = 22.04;
        double output;
        double expected = 10;
        double delta = 0.01;

        output = conversor.poundToKg(input);
        assertEquals(expected,output,delta);
    }

    @Test
    public void squareMetersToHectaresTest() throws Exception{
        double input = 2500;
        double output;
        double expected = 0.25;
        double delta = 0.01;

        output = conversor.squareMetersToHectares(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void hectaresToSquareMetersTest() throws Exception{
        double input = 0.25;
        double output;
        double expected = 2500;
        double delta = 0.01;

        output = conversor.hectaresToSquareMeters(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void litersToGallonsTest() throws Exception{
        double input = 100;
        double output;
        double expected = 26.41;
        double delta = 0.1;

        output = conversor.litersToGallons(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void gallonsToLitersTest() throws Exception{
        double input = 26.41;
        double output;
        double expected = 100;
        double delta = 0.1;

        output = conversor.gallonsToLiters(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void kmToMilesTest() throws Exception{
        double input = 100;
        double output;
        double expected = 62.13;
        double delta = 0.2;

        output = conversor.kmToMiles(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void milesToKmTest() throws Exception{
        double input = 62.13;
        double output;
        double expected = 100;
        double delta = 0.2;

        output = conversor.milesToKm(input);
        assertEquals(expected, output, delta);
    }

}
