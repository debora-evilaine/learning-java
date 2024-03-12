package co.debora;

import java.awt.*;
import java.util.Scanner;

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {

        String x = "Olá mundo, esse é o novo mundo!";

        System.out.println(x.length()); /* exibe a quantidade de caracteres na String,
        incluíndo espaços em branco e acentos */


        System.out.println("x concatenada: " + x + " concatenada"); //Concatenar um String  outra

        System.out.println(x.contains("novo")); //Para saber se existe tal palavra na String

        System.out.println(x.indexOf("mundo")); //Nos mostra em que índice da String aquela palavra começa

        System.out.println(x.lastIndexOf("mundo")); //No mostra em que índice aquela palavra aparece pela última vez na String

        System.out.println(x.toUpperCase()); //Faz com que a String fique em caixa alta

        System.out.println(x.toLowerCase()); //Faz com que a String fique em caixa baixa

        System.out.println(x.trim()); //Remove espaços desnecessários

        System.out.println(x.substring(5)); //Pega a String a partir do index definido

        System.out.println(x.substring(6, 10)); //A mesma coisa que o anterior, porém com um valor de início e outro de fim

        System.out.println(x.equals(8)); //Compara a String com outro valor, e diz se são iguais ou não (true/false)


    }


    }
