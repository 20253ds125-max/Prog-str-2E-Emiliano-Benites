import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("selecciona una opcion");
        do {
            System.out.println(" menu ");
            System.out.println(" 1-Calcular IMC");
            System.out.println("2- Calcular are de un rectangulo");
            System.out.println("3- Calcular area de un circulo");
            System.out.println("4- Convertir °C a °F");
            System.out.println("5- Salir");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    calcularIMC(sc);
                    break;

                case 2:
                    calcularArea(sc);

                    break;

                case 3:
                    calcularAreaCirculo(sc);
                    break;

                case 4:
                    conversion(sc);
                    break;

                case 5:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.printf("Opcion invalida intente de nuevo");
            }


        }while (opc !=5);
        sc.close();
    }

    /**
     *
     * @param sc - variable de la opcion de menu
     * @return - metodo de retorno de clase
     */
    public static double calcularIMC(Scanner sc){
        System.out.printf("Ingrese su peso en kg");
        double peso = sc.nextDouble();
        System.out.printf("Ingrese su altura en metros ");
        double altura = sc.nextDouble();
        double imc = peso/ (altura * altura);
        System.out.printf("Tu IMC es" + imc);
        return imc;
    }

    /**
     *
     * calcular area clase creada para facilitar la operacion
     * @return
     */
        public static double calcularArea(Scanner sc) {
            System.out.printf("ingrese la base del rectangulo");
            double base = sc.nextDouble();
            System.out.printf("Ingrese la altura del rectangulo");
            double altura = sc.nextDouble();
            double area = base * altura;
            System.out.printf("El area del rectangulo es " + area);
            return area;
        }


            public static double calcularAreaCirculo(Scanner sc) {
                System.out.printf("Ingrese el radio del circulo");
                double radio = sc.nextDouble();
                double area = Math.PI * radio;
                System.out.printf("El area del circulo es " + area);
                return area;
            }

    /**
     *
     *
     * @return - metodo de retorno de clase
     */
                public static double conversion (Scanner sc){
                    System.out.printf("Ingrese la temperatura en °C");
                    double caelsius = sc.nextDouble();
                    double fa = (caelsius * 1.8) + 32;
                    System.out.printf("La temperatura a grados °F es: " + fa);
                    return fa;
                }
            }





