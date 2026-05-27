import java.util.Scanner;
import java.security.MessageDigest;
public class sistema_registro {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            // starting and asking how much users should add
            int i = 0;
            System.out.println("=========Bienvenido al sistema de registro=========");
            System.out.println("---¿Cuantos usuarios desea registrar?---");
            int cantidadUsuarios = input.nextInt();
            
            // variables of arrays
            String[] name, lastname, mail;
            //String[] password;
            String[] rawpass;
            
            // creating arrays
            name = new String[cantidadUsuarios];
            lastname = new String[cantidadUsuarios];
            mail = new String[cantidadUsuarios];
            rawpass = new String[cantidadUsuarios];
            

            // instance of MessageDigest for hashing passwords
            MessageDigest md = MessageDigest.getInstance("SHA-256");
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
                rawpass[i] = input.next();
                // password to hash
                byte[] hash = md.digest(rawpass[i].getBytes());
                // converting hash to string
                StringBuilder password = new StringBuilder();
                //byte[] hash = md.digest(rawpass.getBytes());
                
            }

            // showing the total of user registered

            System.out.println("===================================================");
            System.out.println("===========Total Usuarios Registrados=====================");
            System.out.println("===================================================");
            for (i = 0; i < cantidadUsuarios; i++) {
                System.out.println("Usuario n° " + (i+1));
                System.out.println("Nombre: " + name[i]);
                System.out.println("Apellido: " + lastname[i]);
                System.out.println("Correo: " + mail[i]);
            }
        }
    }
}
