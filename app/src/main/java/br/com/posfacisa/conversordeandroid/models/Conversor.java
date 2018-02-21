package br.com.posfacisa.conversordeandroid.models;

/**
 * Created by bruno on 17/02/2018.
 */

public class Conversor {

    public double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    public double celsiusToFahrenheit(double celsius){
        double fahrenheit = (1.8 * celsius) + 32;
        return fahrenheit;
    }

    public double centimetersToInches(double centimeters) {
        double inches = centimeters / 2.54;
        return inches;
    }

    public double inchesToCentimeters(double inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public double kgToPound(double kg) {
        double pound = kg * 2.2046;
        return pound;
    }

    public double poundToKg(double pound) {
        double kg = pound / 2.2046;
        return kg;
    }

    public double squareMetersToHectares(double squareMeters) {
        double hectares = squareMeters / 10000;
        return hectares;
    }

    public double hectaresToSquareMeters(double hectares) {
        double squareMeters = hectares * 10000;
        return squareMeters;
    }

    public double litersToGallons(double liters) {
        double gallons = liters / 3.78541178;
        return gallons;
    }

    public double gallonsToLiters(double gallons) {
        double liters = gallons * 3.78541178;
        return liters;
    }

    public double kmToMiles(double km) {
        double miles = km / 1.60934;
        return miles;
    }

    public double milesToKm(double miles) {
        double km = miles * 1.60934;
        return km;
    }

    public void fecharConexao(){

    }
}
