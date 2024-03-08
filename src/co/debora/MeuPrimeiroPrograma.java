package co.debora;

public class MeuPrimeiroPrograma {

    static int x; /* Essa variável tem uma visibilidade padrão, ou seja,
    somente classes pertencentes ao mesmo pacote que ela podem acessá-la
    (isso ocorre quando não escrevemos nem "public" nem "private"), ou seja,
    não escrevi nada na frente
    */
    public static int y; /* Essa variável tem uma visibilidade pública,
    ou seja, é acessivel a todas as classes de todos os pacotes */

    private static int z; /* Essa variável possui visibilidade privada, o
    que significa que somente a classe em que ela foi declarada tem acesso
    a ela, nesse caso, a classe MeuPrimeiroPrograma. */

    public static void main(String[] args){




    }
}