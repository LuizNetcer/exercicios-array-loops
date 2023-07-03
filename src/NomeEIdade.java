import java.util.Scanner;

/*Faca um programa que leia conjuntos de dois valores ,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(pare inserindo o valor 0 no campo nome)
 */
public class NomeEIdade {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
    System.out.println("Nome: ");
    nome = Scan.next();
    if (nome.equals("0")) break;
    System.out.println("idade: ");
    idade = Scan.nextInt();
}
        System.out.println("continue aqui ");
    }
}
