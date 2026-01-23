import java.util.Scanner;

public class ControIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        // Validación de edad
        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida");
            return; // termina el programa
        }

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();

        int tarifa;

        if (edad < 12) {
            tarifa = 50;
        } else if (edad <= 17) { // entre 12 y 17
            if (esEstudiante) {
                tarifa = 60;
            } else {
                tarifa = 80;
            }
        } else { // edad >= 18
            if (esEstudiante) {
                tarifa = 90;
            } else {
                tarifa = 120;
            }
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Edad ingresada: " + edad);
        System.out.println("Es estudiante: " + (esEstudiante ? "Sí" : "No"));
        System.out.println("Tarifa final: " + tarifa);

        sc.close();
    }
}
