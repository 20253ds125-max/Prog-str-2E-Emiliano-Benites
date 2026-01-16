import java.util.Scanner;
public class Main{
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
         int num = pedirEntero(sc);
         int resultado = sumaNum(num);

        System.out.printf("La suma d elos numeros del 1 a " + num+ "es" + resultado);
        sc.close();
    }
    public static int pedirEntero(Scanner scanner){
        System.out.printf("ingresa un numero ");
        return scanner.nextInt();
    }
    public static int sumaNum(int num){
        int suma = 0;

        for (int i = 1;i <= num ; i++){
            suma+= i;
        }
        return suma;
    }
}