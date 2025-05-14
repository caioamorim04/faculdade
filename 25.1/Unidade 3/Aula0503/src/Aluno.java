import java.util.Scanner;

public class Aluno {

    public static int numeroDeMatricula;
    public static String nome;
    public static char sexo;

    
    public static void main(String[] args) {
    numeroDeMatricula = informarNumeroDeMatricula();

    }
    public static int informarNumeroDeMatricula(){
        //Obter o número da matricula digitado pelo usuário

    try (Scanner teclado = new Scanner(System.in)) {
        numeroDeMatricula = teclado.nextInt();
    }
    
    return numeroDeMatricula;

    }

}
