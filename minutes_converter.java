// my goal is make a converter of minutes to exact number of sec, hours, 
// days and years
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner minute = new Scanner(System.in)) {
            System.out.println("Ingrese los minutos a convertir");

            long minutes = minute.nextLong();
            long seconds = minutes * 60;
            long años = minutes / 525600;
            long minutesañosres = minutes % 525600;
            long dias = minutes / 1440;
            long minutesdiasres = minutes % 1440;
            long horas = minutes / 60;
            long minuteshoursres = minutes % 60;

            System.out.println("La conversion aprox de: " + minutes + " es");
            System.out.println("Segundos totales: " + seconds);
            System.out.println("Horas: " + horas);
            System.out.println("Dias: " + dias);
            System.out.println("Años: " + años);
        }
    }
}