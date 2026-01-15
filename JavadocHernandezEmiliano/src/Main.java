import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("selecciona una opcion");
        do {
            System.out.println("menu");
            System.out.println(" 1-Calcular IMC");
            System.out.println("2- Calcular are de un rectangulo");
            System.out.println("3- Convertir °C a °F");
            System.out.println("4- Calcular area de un circulo");
            System.out.println("5- Salir");


            switch (5) {
                case 1:
                    System.out.println("seleccionaste la opcion uno ");
                    break;

                case 2:
                    System.out.println("Calcular el area de un rectangulo");

                    break;

                case 3:
                    System.out.println("conversion de grados");
                    System.out.println("Ingrese su temperatura en grados °C");
                    double C = sc.nextDouble();
                    double GC = (C *1.8)+32;
                    System.out.println("tus grados F " +GC);
                    break;

                case 4:
                    System.out.println("Calcula el area de un circulo");
                    System.out.println("ingrese el radio delcirculo");
                    double rad =sc.nextDouble();
                    double areaC = 3.1416* (rad *rad);
                    System.out.println("El area de tu circulo es " + areaC);
                    break;

                case 5:
                    System.out.println("saliendo del programa");
                    break;
            }


        }
    }

    /**
     *
     * @param pesoKG -> parametro de peso
     * @param alturaMetro -> parametro de altur
     * @param sc -> previamente declarado
     * @return
     */
    public static double calcularIMC(double pesoKG, double alturaMetro, Scanner sc){
        double IMC = pesoKG / (alturaMetro * alturaMetro);
        System.out.println("IMC: " + IMC);
        return IMC;
    }
    public static double calcularAreaRectangulo (double alturaR, double baseR, Scanner sc){
        System.out.println("ingrese la base del rectangulo");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double Altura = sc.nextDouble();
        double area = base * Altura;
        System.out.println("el area es " + area);
    }
}

