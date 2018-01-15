/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edenero.mayo2018;
import javax.swing.JOptionPane;
/**
 *
 * @author SGUARDATB
 */
public class EDeneroMayo2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        JOptionPane.showMessageDialog(null, "Bienvenido al mundo de la POO");
        Rectangulo unRectangulo = new Rectangulo(4.5, 6.2);
        System.out.println("\nArea del rectángulo: " + unRectangulo.calculaArea());
        Circulo unCirculo = new Circulo(5.6);
        System.out.println("\nArea del círculo: " + unCirculo.calculaArea());
    }
    
}
