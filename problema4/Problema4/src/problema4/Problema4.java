/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numerodias;
        double precioDiario;
        double subTotal;
        double totalPagar;
        double descuento;
        
        System.out.println("Ingrese los días que va a hospedarse en el hotel");
        numerodias = entrada.nextInt();
        System.out.println("Ingrese el precio diario de la habitación:");
        precioDiario = entrada.nextDouble();
        
        subTotal = precioDiario * numerodias;
               
        if(numerodias > 5 && numerodias <=10){
            descuento = (subTotal * 10)/100;
            totalPagar = subTotal - descuento;
        }else if(numerodias > 10 && numerodias <=15){
            descuento = (subTotal * 15)/100;
            totalPagar = subTotal - descuento;
        }else if(numerodias > 15){
            descuento = (subTotal * 20)/100;
            totalPagar = subTotal - descuento;
        }else{
            totalPagar = subTotal;
        }
        
        System.out.printf("\nEl subtotal a pagar de la habitación es: %.2f\n"
                + "El total a pagar del total es: %.2f\n", 
                subTotal, totalPagar);
    }
    
}
