// Una empresa que vende licencias de software corporativas te pide un programa de consola. El usuario debe ingresar la cantidad de licencias que quiere comprar. 
// Cada licencia cuesta $100 de forma estándar, pero aplican las siguientes reglas de negocio:
// Si compra de 10 a 49 licencias: Recibe un 10% de descuento.
// Si compra 50 o más licencias: Recibe un 20% de descuento.
import java.util.Scanner;
public class system_sell_console {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double pricePerLicense = 100.0;
            int quantity;

            System.out.println("¿Cuántas licencias desea comprar?");
            quantity = input.nextInt();

            double totalCost = pricePerLicense * quantity;
             System.out.println("El costo de su compra es: $" + totalCost);
            
             if (quantity >= 10 && quantity < 50) {
                totalCost *= 0.9; // apply 10% discount
                System.out.println("Se aplicó un descuento del 10%");
            } else if (quantity >= 50) {
                totalCost *= 0.8; // apply 20% discount
                System.out.println("Se aplicó un descuento del 20%");
            }

            System.out.println("El costo total su compra es: $" + totalCost);
            System.out.println("Gracias por su compra, ¡esperamos que disfrute de nuestro software!");
        }
    }
}