import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double validas = 0;
        double baja = 0;
        double normales = 0;
        double altas = 0;
        double criticas = 0;

        while (true) {
            System.out.printf("(Finaliza ingresando -999)");
            double p = sc.nextDouble();
            if (p == -999) {
                break;
            }

            if (!P2Service.esValida(p)) {
                System.out.printf("Lectura fuera de rango");
                continue;
            }
            validas++;

            String c = P2Service.clasificacion(p);
            if (c.equals("Baja")) {
                baja++;
            } else if (c.equals("Normal")) {
                normales++;
            } else if (c.equals("Alta")) {
                altas++;
            } else if (c.equals("Criticas")) {
                criticas++;
                break;
            }
        }
            System.out.println("===Resumen==");
            System.out.println(" Lecturas validas " + validas);
            System.out.println(" Lecturas bajas " + baja);
            System.out.println(" Lecturas Normales " + normales);
            System.out.println(" Lecturas Altas " + altas);
            System.out.println(" Lecturas criticas " + criticas);
            sc.close();

    }
}

