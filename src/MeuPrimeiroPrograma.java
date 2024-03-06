import java.util.Scanner;

public class MeuPrimeiroPrograma {
    public static void main(String[] args){
        int x = 10;//Adição do x como variável global
        System.out.println("Antes de ressign: " + x);
        /* if (true){
            int x = 10; /* Variável local a esse escopo; não é
            acessável fora desse if
        }
        System.out.println(x); */

        //CORRIGIDA:

        if(true){
            x = 20;
        }
        System.out.println("Após o reassign: " + x);

    }
}