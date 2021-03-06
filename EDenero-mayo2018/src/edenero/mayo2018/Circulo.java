package edenero.mayo2018;



/**
 *
 * @author SGUARDATB
 */
public class Circulo {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public double calculaArea(){
        return Math.PI * radio * radio;
    }
    
}
