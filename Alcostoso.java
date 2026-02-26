import java.util.Scanner;
public class Alcostoso{
    /**@ param: el costo de la compra va a ser en un valor décimal 
     * @ param: el descuento que se aplica se dará en un décimal
     * @ return: se devolverá al usuario el descuento que se aplique según el costo que tenga
     */
    public static double datos(double descuento, double costo){
            double datos =  (costo * descuento) - costo;
        return datos;
    }
        public static void main(String[] args){
            /**En el segundo método, encontramos que se le pide al usuario el número de cédula y el valor por el cual va a pagar para luego compararlo con los datos que están y 
             * mostrarle al usuario el valor que debe pagar con o si descuento */
            Scanner lector = new Scanner(System.in);

            System.out.println("Ingrese su numero de cedula por favor");
            double numero = lector.nextDouble();
            System.out.println("Ingrese el valor de la compra");
            double costos = lector.nextDouble();

            if (costos < 300000){
                System.out.println("No hay descuento, el valor a pagar es: " +costos);
            }
            else if(costos >= 300000 && costos <= 1000000){
                double total = datos(costos,0.05);
                System.out.println("Tiene un descuento del 5%, el valor a pagar con el descuento es: " +total);
            }
            else{
                double total = datos(costos,0.10); 
                System.out.println("Tiene un descuento del 10%, el valor a pagar con el descuento es: " +total);
            }
        }
}