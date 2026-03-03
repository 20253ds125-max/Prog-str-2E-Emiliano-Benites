public class P2Service {
    public static boolean esValida(double p) {
            return p > 80 && p < 200;
}
public static  boolean esBaja(double p){
        return  p < 100 ;
    }
    public static  boolean esCritica(double p){
        return p >= 140 || p <=80;
    }
    public  static boolean esNormal(double p){
            return p >=100 && p <=120;
    }
    public static boolean esAlta(double p) {
        return p >= 121 && p <= 139;
    }
    public static String clasificacion(double p){
        if (p < 100){
            return "Baja";
        } else if (p <= 120) {
            return "Normal";
        } else if (p <= 139) {
            return "Alta";
        }else{
            return "Criticas";
        }


    }
}
