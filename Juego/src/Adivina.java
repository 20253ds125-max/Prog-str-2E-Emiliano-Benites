import java.util.Random;
import java.util.Scanner;

public class Adivina {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ramdom =new  Random();

        int limitIntentos = 7;
        int mayor = 100;
        int menor = 1;
        int intentos = 0;
        int secreto = ramdom.nextInt(mayor)+menor;
        boolean gano = false;

        System.out.printf("Adivina el numero del 1 al 100 tienes maximo " + intentos + " intentos ");

        while (intentos < limitIntentos && gano ){
            int valor = validacion(mayor,menor, intentos,sc, "intentos");
            intentos++;
            if (valor == secreto){
                System.out.printf("Felizidades ganaste en " + intentos + "intentos");
                gano = true;
                if (valor> mayor){
                    System.out.printf("El dato ingresado es mayor ");
                }else {
                    System.out.printf("El dato ingresado es menor");

                }
            }
if (gano != true){
    System.out.printf("Lo sentimos no pudiste adivinar erl numero");
    sc.close();
}
        }

    }
    public static int validacion (int mayor, int menor, int intentos, int nonumerico,Scanner sc ,String mensaje){
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                int valor = sc.nextInt();
                if (valor <= mayor && valor >= menor){
                    return valor;
                }
                System.out.printf("Numero fuera de rango");
            }else {
                System.out.printf("El dato no es numerico");
                if (sc.hasNextInt()){
                    nonumerico++;
                    intentos++;
                    sc.next();
                }
            }
        }
    }
}
