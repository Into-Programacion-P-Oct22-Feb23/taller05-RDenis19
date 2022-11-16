/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import java.util.Scanner;
import java.util.Locale;
/*
 *
 * @author Usuario iTC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        
        String descripcionArticulo; 
        int cantidad;
        double precioUnitario;
        double descuento = 15; 
        double valorPagar;
        
        System.out.println("Ingrese la descripcion del Articulo");
        descripcionArticulo = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad");
        cantidad = entrada.nextInt();
        
        System.out.println("Ingrese el precio unitario");
        precioUnitario = entrada.nextDouble();
        
        valorPagar = cantidad * precioUnitario;
        
        if (cantidad > 50) {
            descuento = (valorPagar * descuento);
            valorPagar = valorPagar - descuento;
        }
        System.out.printf("Articulo: %s\nTiene un valor total de:"
                + "%.2f\n", descripcionArticulo, valorPagar);
    }
    
}
