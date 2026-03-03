import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaracion de variables
        boolean alerta = false;
        double bajas = 0;
        double normales = 0;
        double altas = 0;
        double criticas =0;
        double validas =0;


        while (true){
            System.out.printf("Temperatura (-999 para terminar)");
            double t =sc.nextDouble();
            if (t == -999){
                break;
            }
            //valida t  == -999 entonces brake

            if (!U2Services.esRangoValido(t)){
                System.out.printf("Lectura fuera de rango");
                continue;
            }
            validas ++;
            //Aumentar validacion i++

            if (U2Services.esCritica(t)) {
                System.out.printf("Alertta critica");
                criticas++;
                alerta = true;
                break;

            }
            String c = U2Services.clasificacion(t);
            if (c.equals("Baja")){
                bajas++ ;                     //si c es igual a baja entonces aumentar bajas +1
            } else if (c.equals("Normal")){
                normales++;
            } else if (c.equals("Alta")){
                altas++;
            }

            }
        System.out.printf("==Resumen==");
        System.out.printf("Lecturas validas" +validas);
        System.out.printf("Lecturas bajas" + bajas);
        System.out.printf("Lecturas normales" + normales);
        System.out.printf("Lecturas altas" + altas);
        System.out.printf("Lecturas criticas" + criticas);
        sc.close();
        }
    }
