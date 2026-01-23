import java.util.Scanner;

public class ActividadSwichCalculadora {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Selecciona una opcion");
        System.out.printf("1- Sumar");
        System.out.printf("2- Restar");
        System.out.printf("3- Multiplicar");
        System.out.printf("4- Dividir");

        int opc = sc.nextInt();

        System.out.printf("Ingrese valor a");
        double a = sc.nextDouble();

        System.out.printf("Ingrese valor b");
        double b = sc.nextDouble();

        double resultado;

        switch (opc){
            case 1:
                resultado = a+b;
                System.out.printf("Suma");
                System.out.printf(" valor a = " + a + "valor b = "+ b);
                System.out.printf("Resultado" + resultado);
                break;

            case 2:
                resultado = a-b;
                System.out.printf("Resta");
                System.out.printf(" valor a = " + a + "valor b = "+ b);
                System.out.printf("Resultado" + resultado);
                break;

            case 3:
                resultado = a*b;
                System.out.printf("Multiplicacion");
                System.out.printf(" valor a = " + a + "valor b = "+ b);
                System.out.printf("Resultado" + resultado);
                break;

            case 4:
                System.out.printf("Divicion");
                System.out.printf("valor a = " +a + "valor b =" + b);
                if (b==0) {
                    System.out.printf("No se puede dividir entre cero");
                }else {
                    resultado = a/ b;
                    System.out.printf("Resultado" + resultado);
                }
                break;

            default:
                System.out.printf("Opcion invalida");
                break;
        }
sc.close();
    }
}
