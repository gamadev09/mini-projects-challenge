import java.util.Scanner;
public class sistema_registro {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // starting and asking how much users should add
            int i = 0;
            System.out.println("=========Bienvenido al sistema de registro=========");
            System.out.println("---¿Cuantos usuarios desea registrar?---");
            int cantidadUsuarios = input.nextInt();
            
            // variables of arrays
            String[] name, lastname, mail;
            String[] password;

            // creating arrays
            name = new String[cantidadUsuarios];
            lastname = new String[cantidadUsuarios];
            mail = new String[cantidadUsuarios];  
            password = new String[cantidadUsuarios];

            // asking for data
            for (i = 0; i < cantidadUsuarios; i++) {
                System.out.println("Registre el n° " + (i+1) + " usuario");
                System.out.println("Ingrese su nombre");
                name[i] = input.next();
                System.out.println("Ingrese su apellido");
                lastname[i] = input.next();
                System.out.println("Ingrese su correo");
                mail[i] = input.next();
                System.out.println("Ingrese su contraseña");
                password[i] = input.next();
            }

            // showing the total of user registered

            for (i = 0; i < cantidadUsuarios; i++) {
                System.out.println("===================================================");
                System.out.println("===========Total Usuarios Registrados=====================");
                System.out.println("===================================================");
                System.out.println("Usuario " + (i+1));
                System.out.println("Nombre: " + name[i]);
                System.out.println("Apellido: " + lastname[i]);
                System.out.println("Correo: " + mail[i]);
            }
        }
    }
}
