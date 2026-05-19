import java.util.Scanner;

public class CalcularAreaRec {

    public static void main (String[] args){

        //Calcular area Rectangulo

        double base = 0;
        double altura =0;
        double area = 0;


        Scanner entrada =new Scanner(System.in);

        System.out.println(" Digita la base : ");
        base = entrada.nextDouble();

        System.out.println(" Digita la altura: ");
        altura = entrada.nextDouble();

        //calculo de area

        area= base * altura ;

        System.out.println(" el area del rectangulo es : "+ area + " cm² ");

        entrada.close();



    }

}
