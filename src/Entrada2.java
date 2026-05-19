

import java.util.Scanner ;


public class Entrada2 {

    public static void main (String [] args){

    Scanner entrada = new Scanner(System.in );

        System.out.println("Ingresa tu edad :");
        int age = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingresa tu nombre :");
        String name = entrada.nextLine();

        entrada.close();



    }



}
