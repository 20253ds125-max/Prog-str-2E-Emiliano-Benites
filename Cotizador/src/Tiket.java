import java.util.Scanner;

public class Tiket {
   private double pesokg = 0;
   private double distanciakm = 0;
   private int tipoServicio1 = 1;
   private boolean esZonaRemota = false;

   public Tiket(){
   }

   public double calculoPeso(double pesoTotal){
       pesokg = pesoTotal / pesoTotal;

       return pesokg * 12;

   }
   public  double calcularCostoDistancia(double costo, double distancia, double costoTotal){
       if (distancia <= 50 ){
           costoTotal = costo + 20;
           if (distancia >= 51 && distancia <= 200){
               costoTotal = costo + 60;
               if (distancia > 200){
                   costoTotal = costo + 120;

               }
       }

       }
       return costoTotal;
   }


}
