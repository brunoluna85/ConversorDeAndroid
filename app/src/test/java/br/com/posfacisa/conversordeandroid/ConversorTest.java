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
        float input = 212;
        float output;
        float expected = 100;
        double delta = .1;

        output = Conversor.fahrenheitToCelsius(input);
        assertEquals(expected, output, delta);

        input = 98.6f;
        output = 0;
        expected = 37;

        output = Conversor.fahrenheitToCelsius(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void celsiusToFahrenheit() throws Exception{
        float input = 37;
        float output;
        float expected = 98.6f;
        double delta = .1;

        output = Conversor.celsiusToFahrenheit(input);
        assertEquals(expected, output, delta);

        input = 100;
        output = 0;
        expected = 212;

        output = Conversor.celsiusToFahrenheit(input);
        assertEquals(expected, output, delta);
    }

}
