/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author emil
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Lee un número por teclado que pida el precio 
de un producto(puedetener decimales) y calcule el precio 
final con IVA. El IVA será unaconstante que será del 19%.*/
       Scanner scan = new Scanner(System.in);
       double precio = scan.nextDouble();  
       precio = precio + (precio*0.19);
       System.out.println("el precio es de " + precio);
    }
    
}
