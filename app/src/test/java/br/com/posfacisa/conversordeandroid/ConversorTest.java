package br.com.posfacisa.conversordeandroid;

import org.junit.Test;

import br.com.posfacisa.conversordeandroid.models.Conversor;

import static org.junit.Assert.*;

/**
 * Created by bruno on 17/02/2018.
 */

public class ConversorTest{

    @Test
    public void fahrenheitToCelsiusTest() throws Exception{
        double input = 212;
        double output;
        double expected = 100;
        double delta = 0.1;

        output = Conversor.fahrenheitToCelsius(input);
        assertEquals(expected, output, delta);

        input = 98.6;
        output = 0;
        expected = 37;

        output = Conversor.fahrenheitToCelsius(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void celsiusToFahrenheitTest() throws Exception{
        double input = 37;
        double output;
        double expected = 98.6;
        double delta = 0.1;

        output = Conversor.celsiusToFahrenheit(input);
        assertEquals(expected, output, delta);

        input = 100;
        output = 0;
        expected = 212;

        output = Conversor.celsiusToFahrenheit(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void centimetersToInchesTest() throws Exception{
        double input = 100;
        double output;
        double expected = 39.37;
        double delta = 0.01;

        output = Conversor.centimetersToInches(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void inchesToCentimetersTest() throws Exception{
        double input = 39.37;
        double output;
        double expected = 100;
        double delta = 0.01;

        output = Conversor.inchesToCentimeters(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void kgToPoundTest() throws Exception{
        double input = 10;
        double output;
        double expected = 22.04;
        double delta = 0.01;

        output = Conversor.kgToPound(input);
        assertEquals(expected,output,delta);
    }

    @Test
    public void poundToKgTest() throws Exception{
        double input = 22.04;
        double output;
        double expected = 10;
        double delta = 0.01;

        output = Conversor.poundToKg(input);
        assertEquals(expected,output,delta);
    }

    @Test
    public void squareMetersToHectaresTest() throws Exception{
        double input = 2500;
        double output;
        double expected = 0.25;
        double delta = 0.01;

        output = Conversor.squareMetersToHectares(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void hectaresToSquareMetersTest() throws Exception{
        double input = 0.25;
        double output;
        double expected = 2500;
        double delta = 0.01;

        output = Conversor.hectaresToSquareMeters(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void litersToGallonsTest() throws Exception{
        double input = 100;
        double output;
        double expected = 26.41;
        double delta = 0.1;

        output = Conversor.litersToGallons(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void gallonsToLitersTest() throws Exception{
        double input = 26.41;
        double output;
        double expected = 100;
        double delta = 0.1;

        output = Conversor.gallonsToLiters(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void kmToMilesTest() throws Exception{
        double input = 100;
        double output;
        double expected = 62.13;
        double delta = 0.2;

        output = Conversor.kmToMiles(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void milesToKmTest() throws Exception{
        double input = 62.13;
        double output;
        double expected = 100;
        double delta = 0.2;

        output = Conversor.milesToKm(input);
        assertEquals(expected, output, delta);
    }

}
