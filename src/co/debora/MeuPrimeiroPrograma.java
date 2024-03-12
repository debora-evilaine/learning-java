package co.debora;

import java.awt.*;
import java.util.Scanner;

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {

        String password = "123456";

        System.out.println("Type in your password: ");

        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        //== não pode ser usado aqui, pois ele não compara o conteúdo das Strings, e sim o seu endereço de memória
        System.out.println(password.equals(pass));

        String x = "123456";
        String y = "123456";

        System.out.println(x == y);


    }


    }
