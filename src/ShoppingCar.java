import java.util.Scanner;

public class ShoppingCar {

    public static void main (String[] args){

        // SHOPPING CART PROGRAM

        Scanner entrada = new Scanner (System.in);

        String item;
        double precio;
        int cantidad;
        char moneda = '$';
        double total;

        System.out.print("Que articulo le gustaria comprar ? : ");
        item = entrada. nextLine();

        System.out.print("¿ cual es el precio de cada un@ ? : ");
        precio= entrada.nextDouble();

        System.out.print("Cuant@s vas a comprar? :");
        cantidad= entrada.nextInt();

        total = precio * cantidad ;

        System.out.println("Haz comprado "+cantidad +" " + item);

        System.out.println("\n El total de tu compra es : " +moneda+ total );

        entrada.close();



    }

}
