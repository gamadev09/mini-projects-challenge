import java.util.Scanner;
public class basic_atm {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            double money = 1000;
            int selection = 0;
            String usuario = null;
            double withdraw = 0;

            System.out.println("Ingrese su nombre");
            usuario = input.nextLine();
            System.out.println("Bienvenido " + usuario);

            while (selection !=3){
                System.out.println("===================================");
                System.out.println("               ATM SYSTEM          ");
                System.out.println("===================================");
                System.out.println("¿Qué desea realizar?");
                System.out.println("1. Ver dinero");
                System.out.println("2. Retirar");
                System.out.println("3. Salir");
                
                selection = input.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("Saldo " + money +  " $");
                    break;
                    case 2:
                        System.out.println("¿Cúanto desear retirar?");
                        withdraw = input.nextDouble();

                        if (withdraw > money){
                            System.out.println("Saldo Insuficiente");
                        }
                        else {
                            money -= withdraw;
                            System.out.println("Retiro Completado, retire su efectivo");
                        }
                    break;
                    case 3:
                        System.out.println("Gracias por usar nuestro servicio");
                    break;
                    default:
                        System.out.println("Opción Invalida");
                }
            }
        }
    }
}
