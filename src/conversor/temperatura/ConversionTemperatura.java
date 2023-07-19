package conversor.temperatura;

import javax.swing.*;

/**
 *
 * @author David_Ereu
 * @version 1.
 */
public class ConversionTemperatura {

    /**
     * convertirCelsiusFahrenheit():
     * Este metodo hace la conversion de Celsius a Fahrenheit.
     */
    public void convertirCelsiusFahrenheit(double valor) {
        double cFahrenheit = (valor * 1.8) + 32;
        cFahrenheit = (double)Math.round(cFahrenheit * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + cFahrenheit + " Fahrenheit");
    }

    /**
     * convertirCelisusKelvin():
     * Este metodo hace la conversion de Celisus a Kelvin.
     */
    public void convertirCelisusKelvin(double valor) {
        double cKelvin = valor + 273.15;
        cKelvin = (double)Math.round(cKelvin * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + cKelvin + " Kelvin");
    }

    /**
     * convertirCelsiusRankine():
     * Este metodo hace la conversion de Celsius a Rankine.
     */
    public void convertirCelsiusRankine(double valor) {
        double cRankine = (valor * 1.8) + 491.67;
        cRankine = (double)Math.round(cRankine * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + cRankine + " Rankine");
    }


    /**
     * convertirFahrenheitCelsius():
     * Este metodo hace la conversion de Fahrenheit a Celsius.
     */
    public void convertirFahrenheitCelsius(double valor) {
        double fCelsius = (valor - 32) * ( 0.556 );
        fCelsius = (double)Math.round(fCelsius * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + fCelsius + " Celsius");
    }

    /**
     * convertirFahrenheitKelvin():
     * Este metodo hace la conversion de Fahrenheit a Kelvin.
     */
    public void convertirFahrenheitKelvin(double valor) {
        double fKelvin = (valor + 459.67)*(0.556);
        fKelvin = (double)Math.round(fKelvin * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + fKelvin + " Kelvin");
    }

    /**
     * convertirFahrenheitRankine():
     * Este metodo hace la conversion de Fahrenheit a Rankine.
     */
    public void convertirFahrenheitRankine(double valor) {
        double fRankine = valor + 459.67;
        fRankine = (double)Math.round(fRankine * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + fRankine + " Rankine");
    }


    /**
     * convertirKelvinCelsius():
     * Este metodo hace la conversion de Kelvin a Celsius.
     */
    public void convertirKelvinCelsius(double valor) {
        double kCelsius = valor - 273.15;
        kCelsius = (double)Math.round(kCelsius * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + kCelsius + " Celsius");
    }

    /**
     * convertirKelvinFahrenheit():
     * Este metodo hace la conversion de Kelvin a Fahrenheit.
     */
    public void convertirKelvinFahrenheit(double valor) {
        double kFahrenhit = ((valor - 273.15) * (1.8)) + 32;
        kFahrenhit = (double)Math.round(kFahrenhit * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + kFahrenhit + " Fahrenheit");
    }

    /**
     * convertirKelvinRankine():
     * Este metodo hace la conversion de Kelvin a Rankine.
     */
    public void convertirKelvinRankine(double valor) {
        double kRankine = valor * 1.8 ;
        kRankine = (double)Math.round(kRankine * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + kRankine + " Rankine");
    }


    /**
     * convertirRankineCelsius():
     * Este metodo hace la conversion de Rankine a Celsius.
     */
    public void convertirRankineCelsius(double valor) {
        double rCelsius = (valor - 491.67) * (0.556);
        rCelsius = (double)Math.round(rCelsius * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + rCelsius + " Celsius");
    }

    /**
     * convertirRankineFahrenheit():
     * Este metodo hace la conversion de Rankine a Fahrenheit.
     */
    public void convertirRankineFahrenheit(double valor) {
        double rFahrenhit = valor - 459.67;
        rFahrenhit = (double)Math.round(rFahrenhit * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + rFahrenhit + " Fahrenheit");
    }

    /**
     * convertirRankineKelvin():
     * Este metodo hace la conversion de Rankine a Kelvin.
     */
    public void convertirRankineKelvin(double valor) {
        double rKelvin = valor * (0.556);
        rKelvin = (double)Math.round(rKelvin* 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + rKelvin + " Kelvin");
    }
}
