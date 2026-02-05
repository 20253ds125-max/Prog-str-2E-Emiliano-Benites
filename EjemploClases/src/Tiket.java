public class Tiket {
    private double DESCUENTO = 0.10;
    private  double PRECIO = 10;

    public Tiket(){

    }
    public double calcularsubtotal(int cantidad){
        return cantidad*PRECIO;
    }

    public double calcularDescuento(double subtotal){
        return (subtotal*DESCUENTO);
    }
    public double calcularTotal(double subtotal){
        return subtotal- calcularDescuento(subtotal);

    }
    public void imprimirTiket(double total, double descuento, int cantidad, double subtotal){
        System.out.printf("----Tiket----");
        System.out.printf("Cantidad de productos" + cantidad);
        System.out.printf("Subtotal" + subtotal);
        System.out.printf("Descuento" + descuento);
        System.out.printf("Total " + total);
    }
}
