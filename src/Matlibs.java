import java.sql.SQLOutput;
import java.util.Scanner;

public class Matlibs {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        String adjetivo1 ;
        String nombre1;
        String adjetivo2 ;
        String verbo1;
        String adjetivo3 ;

        System.out.println("ingrese un adjetivo 1 : ");
        adjetivo1= entrada.nextLine();
        System.out.println("ingrese un nombre 1 : ");
        nombre1= entrada.nextLine();
        System.out.println("ingrese un adjetivo 2 : ");
        adjetivo2= entrada.nextLine();
        System.out.println("ingrese un verbo  1 en presente : ");
        verbo1= entrada.nextLine();
        System.out.println("ingrese un adjetivo 3 : ");
        adjetivo3= entrada.nextLine();


        System.out.println("\n hoy yo fui a un  "+ adjetivo1+ "zoologico ");
        System.out.println(" en una exhibicion vi un "+ nombre1+" .");
        System.out.println(nombre1+" estaba "+ adjetivo2+ " y "+ verbo1+ "!");
        System.out.println("yo estaba "+ adjetivo3+ "!");


        entrada.close();

    }
}
