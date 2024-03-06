import java.util.Scanner;

public class MeuPrimeiroPrograma {
    public static void main(String[] args){
        int x = 2;
        Integer y = 4; /* Integer é uma classe que "engloba" o conceito
        de inteiro, e abre portas para mais manipulação desse objeto
         da classe Integer */

        System.out.println(y);

        System.out.println(x);

        System.out.println("soma " + (x+y));


        /* Exemplos de métodos que podem ser utilizados ao declarar um objeto
         da classe integer:
         */
        System.out.println(y.byteValue());
        System.out.println(y.toString());
        System.out.println(y.doubleValue());
        System.out.println(y.floatValue());
        System.out.println(y.compareTo(5));


    }
}