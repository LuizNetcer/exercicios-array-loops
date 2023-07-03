import java.util.Scanner;

/* Faca um programa que peca uma nota, entre zero e dez.
mostre uma mensagem caso o valor seja invalido
e continue pedindo ate queo user informe um valor valido
 */
public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota : ");
        nota = scan.nextInt();
        while(nota < 0 || nota > 10){
            System.out.println("nota invalida digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("a nota do aluno é: " + nota);
    }

}
