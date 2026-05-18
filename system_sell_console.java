// Una empresa que vende licencias de software corporativas te pide un programa de consola. El usuario debe ingresar la cantidad de licencias que quiere comprar. 
// Cada licencia cuesta $100 de forma estándar, pero aplican las siguientes reglas de negocio:
// Si compra de 10 a 49 licencias: Recibe un 10% de descuento.
// Si compra 50 o más licencias: Recibe un 20% de descuento.
import java.util.Scanner;
public class system_sell_console {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double pricelicence = 100.0;
            int quantity = 0;
            double totalprice;
            double discount  = 0.0;
            double discountamount = 0.0;

            // ask to user
            System.out.println("¿Cuántas licencias desea comprar?");
            quantity = input.nextInt();

            // calculate if it have discount
            if (quantity >= 10 && quantity <= 49) {
                discount = 0.1;}
            else {
                if (quantity >= 50) {
                    discount = 0.2;
                }
            }

            // totalprice
            totalprice = pricelicence * quantity;
            discountamount = totalprice * discount;

            // output to user

            System.out.println("=========================================");
            System.out.println("           FACTURA DE COMPRA             ");
            System.out.println("=========================================");
            System.out.println("Licencias solicitadas "+ quantity);
            System.out.println("Subtotal "+ totalprice);
            System.out.println("Descuento aplicado " + discount * 100 + " %");
            System.out.println("-----------------------------------------");
            System.out.println("Total neto a pagar " + (totalprice - discountamount));
        }
    }
}