import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeService service = new GradeService();

        String nombre = mensajeTex(sc, "Nombre del alumno");
        double p1 = parcial1Rango(sc, "parcial 1 (0-100) ", 0, 100);
        double p2 = parcial1Rango(sc, "parcial 2 (0-100) ", 0, 100);
        double p3 = parcial1Rango(sc, "parcial 3 (0-100) ", 0, 100);

        int asistencia = asistenciaPar(sc, " Asistencia (0-100) ", 0, 100);
        boolean entregoProyecto = proYeck(sc, " Entrego proyecto? (true / false ) ");

        double promedio = service.calcularPromedio(p1, p2, p3);
        double finalNota = service.calculoFinal(promedio, asistencia);
        String estado = service.determinarEstado(finalNota, asistencia, entregoProyecto);
        reporte(nombre, p1, p2, p3, promedio, asistencia, entregoProyecto, finalNota, estado);

        sc.close();

    }
    public static String mensajeTex(Scanner sc, String msg){
        String texto;
        do {
            System.out.println(msg);
            texto= sc.nextLine();

        }while (texto.isEmpty());
        return texto;
    }
    public static double parcial1Rango (Scanner sc, String msg, double min, double msx ){
        double valor;
        do {
            System.out.printf(msg);
            valor = sc.nextDouble();

        }while (valor<min || valor>msx);
        return valor;
    }
    public static int asistenciaPar (Scanner sc, String msg, int min, int max){
        int valor;
        do {

            System.out.println(msg);
            valor = sc.nextInt();

        }while (valor <min || valor > max);
        return valor;
    }
    public static boolean proYeck( Scanner sc, String msg){
        System.out.printf(msg);
        return sc.nextBoolean();
    }
    public static void reporte ( String nom, double p1, double p2, double p3, double promedio, int asistencias, boolean entregoProyecto, double finalNota, String estado){
        System.out.println("------- Reporte Final-------");
        System.out.println(" Alumno " + nom);
        System.out.printf(" parciales " + p1 + "," + p2 + "," +p3);
        System.out.printf(" Promedio parciales " + promedio);
        System.out.printf(" Entrego proyecto " + entregoProyecto);
        System.out.printf(" Calificacion final " + finalNota);
        System.out.printf(" Estado " + estado);

    }
}