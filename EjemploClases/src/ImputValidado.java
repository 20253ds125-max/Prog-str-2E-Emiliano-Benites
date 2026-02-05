import java.util.Scanner;

public class ImputValidado {
    public int obtenerNumeroEntero (String mensaje, Scanner sc){
        int valor;
        while (true){
            System.out.printf(mensaje);
            if (sc.hasNextInt()){
                valor = sc.nextInt();
                if (valor > 0){
                    return valor;
                }
                System.out.printf("El numero ingresado no es valido");
            }else {
                System.out.printf("El dato ingresado no es numerico");
                sc.nextLine();
            }
        }
    }
}
