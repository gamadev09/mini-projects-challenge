// Una tienda maneja un inventario inicial de 50 unidades de un producto en su base de datos. 
// Escribe un programa que use un bucle continuo (while) para mantener la tienda abierta procesando ventas.

import java.util.Scanner;
public class inventory_store {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // variables
            int stock = 0;
            int quantity = 0;
            System.out.println("¿Cuánto hay en stock?");
            stock = input.nextInt();

            while(stock != 0) {
                System.out.println("=====================================");
                System.out.println("       Sistema de Tienda      ");
                System.out.println("=====================================");
                System.out.println("Stock disponible: " + stock);
                System.out.println("¿Cuántos productos desea comprar");
                quantity = input.nextInt();
                if (quantity > stock) {
                    System.out.println("Stock insuficiente");
                } 
                else {
                    
                    System.out.println("Producto retirado");
                }
            }
        }
    }
}
