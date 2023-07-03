import java.util.Scanner;

/* faca um programa que leia 5 numeros
e informe o maior numero
e a media desses numeros
 */
public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         int numero;
         int count = 0;
         int maior = 0;
         int soma =0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if(numero > maior) maior = numero;
            count++;
        } while (count < 5);

        System.out.println("maior numero: " + maior);
        System.out.println("media: " + (soma/5));


    }
}
