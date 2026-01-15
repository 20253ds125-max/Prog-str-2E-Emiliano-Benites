import java.util.Scanner;

public class Main {
    public static double CLASIFICACON_BAJA =18.5;
    public static double CLASIFICACON_MEDIA =25;
    public static double CLASIFICACION_ALTA = 38;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pesokg = obtenerDouble(sc, "ingresa el peso en kg");
        double alturaM = obtenerDouble(sc, "ingresa altura en metros");
        System.out.println("dame el peso");
        double p = sc.nextDouble();
        System.out.println("Dame la altura");
        double A = sc.nextDouble();
        double i = p/(A*A);
        System.out.println("IMC: "+i);


        System.out.println("clasificacion");

    }

    /**
     * Metodo que retorna un valor capturado por twerminal
     * @param sc -> previamente declarado en main
     * @param mensaje -> es un parametro
     * @return -> double
     */
    public static  double obtenerDouble (Scanner sc, String mensaje ){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     *
     * @param pesokg -> expresado en kg
     * @param alturM -> expresado en metros
     * @return ->  double de imc
     */
    public static  double calcularIMC ( double pesokg, double alturM){
        return pesokg/(alturM*alturM);
    }
    public static String obtenerClasificacionIMC(double IMC){
        if (IMC< CLASIFICACON_BAJA) return "peso bajo";
        else if (IMC< CLASIFICACON_MEDIA) return "peso medio";
        else if (IMC < CLASIFICACION_ALTA)return "peso alto";
         else return "sobrepeso";

        }
    }



