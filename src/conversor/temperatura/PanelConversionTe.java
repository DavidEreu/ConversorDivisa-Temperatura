package conversor.temperatura;

import javax.swing.*;

/**
 *
 * @author David_Ereu
 * @version 1.
 */
public class PanelConversionTe {

    ConversionTemperatura temperatura = new ConversionTemperatura();

    /**
     * convertirTemperaturas():
     * Este metodo contruye el panel con la libreria javax.swing.* llamando la clase ConversionTemperatura y
     * sus metodos internos.
     */
    public void convertirTemperaturas(double valor) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Elija el tipo de conversion a realizar:",  "Temperaturas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine", "De Fahrenheit a Celsius",
                                "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
                                "De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine", "De Rankine a Celsius",
                                "De Rankine a Fahrenheit", "De Rankine a Kelvin"},
                "Seleccion")).toString();

        switch (opcion) {
            case "De Celsius a Fahrenheit":
                temperatura.convertirCelsiusFahrenheit(valor);
                break;

            case "De Celsius a Kelvin":
                temperatura.convertirCelisusKelvin(valor);
                break;

            case "De Celsius a Rankine":
                temperatura.convertirCelsiusRankine(valor);
                break;

            case "De Fahrenheit a Celsius":
                temperatura.convertirFahrenheitCelsius(valor);
                break;

            case "De Fahrenheit a Kelvin":
                temperatura.convertirFahrenheitKelvin(valor);
                break;

            case "De Fahrenheit a Rankine":
                temperatura.convertirFahrenheitRankine(valor);
                break;

            case "De Kelvin a Celsius":
                temperatura.convertirKelvinCelsius(valor);
                break;

            case "De Kelvin a Fahrenheit":
                temperatura.convertirKelvinFahrenheit(valor);
                break;

            case "De Kelvin a Rankine":
                temperatura.convertirKelvinRankine(valor);
                break;

            case "De Rankine a Celsius":
                temperatura.convertirRankineCelsius(valor);
                break;

            case "De Rankine a Fahrenheit":
                temperatura.convertirRankineFahrenheit(valor);
                break;

            case "De Rankine a Kelvin":
                temperatura.convertirRankineKelvin(valor);
                break;
        }
    }
}
