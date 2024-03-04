import java.util.Random;

public class MeuPrimeiroPrograma {

    public static void main(String[] args){
        Random generate = new Random();

        //Gera um número aleatório que pode ir até
        //a casa do número 60

        int i;
        /* while (i < 6){
            int number = generate.nextInt(60);
            System.out.println("O número é " + number);
            i++;
            System.out.println("O valor de i é " + i);
            System.out.println();
        } */

        for(i = 0; i < 6; i++){
            int number = generate.nextInt(60);
            System.out.println("O número é " + number);
            System.out.println("O valor de i é " + i);
            System.out.println();
        }




    }
}
