/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frutas;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Reinaldo
 */
public class Frutas {

    /**
     * Atributos
     */
    final double precio=4200;
    private double numeroDeKilos;
    private double valorAPagar;
    /**
     * Constructor
     * @param args 
     */
    
    
    public Frutas(int numeroDeKilos) {
        this.numeroDeKilos = numeroDeKilos;
    }

    public double getPrecio() {
        return precio;
        // TODO code application logic here
    }

    public double getNumeroDeKilos() {
        return numeroDeKilos;
    }

    /**
     * Metodos
     * @param args
     */
    public double valorAPagar(int numeroDeKilos) {
        double valor1;
        if(numeroDeKilos>0 && numeroDeKilos<=2) {
            valorAPagar= precio*numeroDeKilos;
        }else if(numeroDeKilos>2 && numeroDeKilos<=5) {
            valor1=(precio*numeroDeKilos)*0.1;
            valorAPagar=precio*numeroDeKilos-valor1;
        }else if(numeroDeKilos>5 && numeroDeKilos<=10) {
            valor1=(precio*numeroDeKilos)*0.15;
            valorAPagar=precio*numeroDeKilos-valor1;
        }else{
            valor1=(precio*numeroDeKilos)*0.2;
            valorAPagar=precio*numeroDeKilos-valor1;
        }
        return valorAPagar;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String numStrg= JOptionPane.showInputDialog("Ingrese Kilos");
        int numInt = Integer.parseInt(numStrg);
        Frutas cliente = new Frutas(numInt);
        JOptionPane.showMessageDialog(null,"La compra de "+numInt "kilos, tiene un valor de"+cliente.precio*cliente.numeroDeKilos;
                                           +" \n pero usted tiene un descuento por valor"+cliente.getvalor1();
                                           +" \n por lo tanto usted debe pagar "+cliente.valorAPagar(numInt));
    }
