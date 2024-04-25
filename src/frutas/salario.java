/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;
import javax.swing.JOptionPane;
public class salario {
    public static void main(String[] args) {
        // Definir constantes
        final int DIAS_MES = 30;
        final double SALARIO_MINIMO = 1300000;
        final double AUXILIO_TRANSPORTE = 162000;
        final double COMISION_VENTAS = 0.02;
        
        // Solicitar datos al usuario
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico:"));
        int diasLaborados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días laborados:"));
        double ventasMes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de ventas del mes:"));
        double prestamos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de préstamos:"));
        
        // Calcular sueldo devengado
        double sueldoDevengado = salarioBasico * diasLaborados / DIAS_MES;
        
        // Determinar si tiene derecho a auxilio de transporte
        double auxilio = (salarioBasico <= 2 * SALARIO_MINIMO) ? AUXILIO_TRANSPORTE * diasLaborados / DIAS_MES : 0;
        
        // Calcular comisión de ventas
        double comision = ventasMes * COMISION_VENTAS;
        
        // Calcular total devengado
        double totalDevengado = sueldoDevengado + comision;
        
        // Calcular salario neto
        double salarioNeto = totalDevengado - prestamos;
        
        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Cédula empleado: " + cedula +
                                            "\nNombre Empleado: " + nombre +
                                            "\nSalario Básico: $" + salarioBasico +
                                            "\nAuxilio de Transporte: $" + auxilio +
                                            "\nComisión de Ventas: $" + comision +
                                            "\nPréstamos: $" + prestamos +
                                            "\nSalario Neto a Recibir: $" + salarioNeto);
    }
}

