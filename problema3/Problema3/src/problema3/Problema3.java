/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario iTC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double impuestoPagar;
        double valorPagar;

        System.out.println("Ingrese la marca de su automovil:");
        marca = entrada.nextLine();

        System.out.println("Ingrese el país de origen de su automovil:");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del automovil:");
        costo = entrada.nextDouble();

        valorPagar = costo;

        if (origen.equals ("Alemania")) {
            impuestoPagar = (valorPagar * 20) / 100;
            valorPagar = valorPagar + impuestoPagar;
        } else if (origen.equals("Japón")) {
            impuestoPagar = (valorPagar * 30) / 100;
            valorPagar = valorPagar + impuestoPagar;
        } else if (origen.equals("Italia")) {
            impuestoPagar = (valorPagar * 15) / 100;
            valorPagar = valorPagar + impuestoPagar;
        } else if (origen.equals("Estados Unidos")) {
            impuestoPagar = (valorPagar * 8) / 100;
            valorPagar = valorPagar + impuestoPagar;
        }
        System.out.printf("\nLa marca del utomovil es %s\nEl país de origen %s\n"
                + "El automovil tiene un costo mas impuestos de: %.2f dolares.\n",
                 marca, origen, valorPagar);
    }

}
