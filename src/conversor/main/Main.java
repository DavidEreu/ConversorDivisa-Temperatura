package conversor.main;

import conversor.divisa.PanelConversionDi;
import conversor.temperatura.PanelConversionTe;

import javax.swing.*;

/**
 *
 * @author David_Ereu
 * @version 1.
 */
public class Main {

    public static void main(String[] args) {

        PanelConversionDi divisa = new PanelConversionDi();
        PanelConversionTe temperatura = new PanelConversionTe();

        while (true) {
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                    "Menú", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Divisa", "Conversor de Temperatura"}, "Elegir").toString();

            switch (opciones) {
                case "Conversor de Divisa":
                    divisa.convertirDivisas();
                    int resDi = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                    if(JOptionPane.OK_OPTION == resDi) {
                        continue;
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                    break;

                case "Conversor de Temperatura":
                    String texto = JOptionPane.showInputDialog(null, "Ingrese el cantidad a convertir");
                    double cantidad = Double.parseDouble(texto);
                    temperatura.convertirTemperaturas(cantidad);
                    int resTe = JOptionPane.showInternalConfirmDialog(null, "¿Desea realizar otra Conversión?");
                    if(JOptionPane.OK_OPTION == resTe) {
                        continue;
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                    break;
            }
            break;
        }

    }
}
