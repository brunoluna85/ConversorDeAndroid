package br.com.posfacisa.conversordeandroid.models;

/**
 * Created by bruno on 17/02/2018.
 */

public class Conversor {

    public static float fahrenheitToCelsius(float fahrenheit){
        float celsius = (fahrenheit - 32) / 1.8f;
        return celsius;
    }

    public static float celsiusToFahrenheit(float celsius){
        float fahrenheit = (1.8f * celsius) + 32;
        return fahrenheit;
    }
}
