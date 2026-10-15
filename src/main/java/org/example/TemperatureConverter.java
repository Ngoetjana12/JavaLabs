package org.example;

public class TemperatureConverter {

    private double celsius;

    public TemperatureConverter(double celsius){

        this.celsius = celsius;
    }

    public double covertToFahrenheit(){
        return (celsius * 9.0 / 5.0) + 32;
    }

    public void displayCoversion(){

        double fahrenheit = covertToFahrenheit();
    }

    public void displaySummary(){

        System.out.println("Temperature Conversion");
        System.out.println("Celsius:" + 27);
        System.out.println("Fahrenheit:" + covertToFahrenheit());
    }

}
