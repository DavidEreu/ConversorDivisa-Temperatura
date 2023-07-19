package conversor.divisa;

import javax.swing.*;

/**
 * 
 * @author David_Ereu
 * @version 1.
 */
public class ConversionDivisa {

    /**
     * convertirDePesos():
     * Este metodo hace la conversion de pesos a otra moneda.
     */
    public void convertirDePesos(double valor,String tipoMoneda) {
        String texto = JOptionPane.showInputDialog("Ingrese el cantidad a convertir:");
        double cantidad = Double.parseDouble(texto);
        double moneda = cantidad / valor;
        moneda = (double)Math.round(moneda * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " " +tipoMoneda);
    }

    /**
     * convertirAPesos():
     * Este metodo hace la conversion de otra moneda a pesos.
     */
    public void convertirAPesos(double valor,String tipoMoneda) {
        String texto = JOptionPane.showInputDialog("Ingrese el cantidad a convertir:");
        double cantidad = Double.parseDouble(texto);
        double moneda = valor * cantidad;
        moneda = (double)Math.round(moneda * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes $" + moneda + " en pesos");
    }
}
