package conversor.divisa;

import javax.swing.*;

/**
 *
 * @author David_Ereu
 * @version 1.
 */
public class PanelConversionDi {

    ConversionDivisa monedas = new ConversionDivisa();

    /**
     * convertirDivisas():
     * Este metodo contruye el panel con la libreria javax.swing.* llamando la clase ConversionDivisa y
     * sus metodos internos.
     */
    public void convertirDivisas() {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elija el tipo de conversion a realizar: ",  "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas",
                                "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos",
                                "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"},
                "Seleccion")).toString();

        switch (opcion) {
            case "De Pesos a Dólar":
                monedas.convertirDePesos(4.099,"Dolar");
                break;

            case "De Pesos a Euro":
                monedas.convertirDePesos(4.601,"Euro");
                break;

            case "De Pesos a Libras Esterlinas":
                monedas.convertirDePesos(5.385,"Libra esterlina");
                break;

            case "De Pesos a Yen Japonés":
                monedas.convertirDePesos(29.69,"Yen Japonés");
                break;

            case "De Pesos a Won sub-coreano":
                monedas.convertirDePesos(3.23,"Won sub-coreano");
                break;

            case "De Dólar a Pesos":
                monedas.convertirAPesos(4.099,"Dolar");
                break;

            case "De Euro a Pesos":
                monedas.convertirAPesos(4.601,"Euro");
                break;

            case "De Libras Esterlinas a Pesos":
                monedas.convertirAPesos(5.385,"Libra esterlina");
                break;

            case "De Yen Japonés a Pesos":
                monedas.convertirAPesos(29.69,"Yen Japonés");
                break;

            case "De Won sub-coreano a Pesos":
                monedas.convertirAPesos(3.23,"Won sub-coreano");
                break;
        }
    }
}
