import java.util.Scanner;

public class Entrada {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita tu nombre: ");

        String name = scanner.nextLine();

        System.out.print("Digita tu edad: ");

        int edad = scanner.nextInt();

        System.out.print("Cual es tu promedio ?");

        double promedio = scanner.nextDouble();

        System.out.print("Eres estudiante ? : ");

        boolean esEstudiante= scanner.nextBoolean();

        System.out.println("Tu Nombre es : "+ name+ " y tienes "+ edad+ " años " );

        System.out.println(" tienes un promedio de : "+ promedio);

        if (esEstudiante) {
            System.out.println("eres estudiante");
        }else System.out.println("No eres estudiante ");


        scanner.close ();




    }


}
