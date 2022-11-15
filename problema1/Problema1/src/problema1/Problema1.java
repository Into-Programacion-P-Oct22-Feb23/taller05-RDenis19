/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        double costoKilovatio;
        double consumoKilovatio;
        double valorPagar;
        int edad;
        double descuento = 10;
        
        System.out.println("Ingrese el costo kilovatio/hora: ");
        costoKilovatio = entrada.nextDouble();
        System.out.println("Ingrese el consumo mensual: ");
        consumoKilovatio = entrada.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        valorPagar = costoKilovatio * consumoKilovatio;
        
        if (edad > 65) {
            descuento = (valorPagar * descuento) / 100;
            valorPagar = valorPagar - descuento;
        }
        System.out.printf("El costo de la planilla de luz es: "
                + "%.2f dolares\n", valorPagar);
    }
    
}
