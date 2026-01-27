import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double faren = 0;
        double celci = 0 ;
        double millas = 0;
        double kilometro = 0;
        int min = 1;
        int max =5;
        int opc;

        do {
            System.out.printf("Menu converciones ");
            System.out.println("Elige una opcion");
            System.out.println(" 1- Conversion C a F ");
            System.out.printf(" 2-Conversion F a C ");
            System.out.printf(" 3-Conversion Kilimetros a millas ");
            System.out.printf(" 4-Conversion millas a kilimetros ");
            System.out.printf(" 5-Salir ");
            opc=sc.nextInt();

        switch (opc) {
            case 1:
                System.out.printf(" convercion de grados C a grados F");
                System.out.printf(" ingrese sus grados");
                celci = obetenerValorValido(sc," Procesando " );
                double total = (celci * 9/5) + 32;
                System.out.printf(" Su conversion es de " + total);

                break;
            case 2:
                System.out.printf(" Convercion de grados F a grados C");
                System.out.printf(" Ingrese sus datos");
                faren = obetenerValorValido(sc, " Procesando ");
                double tota = (faren -32) * 9/5;
                System.out.printf(" Su conversion es de " + tota);
                break;
            case 3:
                System.out.printf(" Conversion de kilimetros a millas");
                System.out.printf(" Ingrese sus kilometros ");
                kilometro = obetenerValorValido(sc, " Procesando ");
                double restul = (kilometro * 0.6213712);
                System.out.printf(" su convercion a millas es de " + restul);
                break;
            case 4:
                System.out.printf(" Conversion de millas a kilimetros ");
                System.out.printf(" Ingrese sus millas");
                millas = obetenerValorValido(sc, " procesando ");
                double resu = (millas * 1.60934);
                break;
            case 5:
                System.out.printf(" Saliendo del proceso");
                sc.close();

            default:
                System.out.printf(" Opcion invalida ");
                break;


        }
        }while (opc!=5);


    }
    public static int obetenerValorValido( Scanner sc, String mensaje){
        int valor;
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                return valor;
            }else{
                System.out.printf("El valor ingresado no es un numero");
                sc.next();

            }
        }
    }
}
