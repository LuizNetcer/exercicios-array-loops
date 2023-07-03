/* Desenvolva um gerador de tabuada capaz de gerar
a tabuada de qualquer nmero inteiro entre 1 a 10.
o user deve informar de qual numero ele deseja ver a tabuada
a saida deve ser conforme exemplo abaixo
5 x 1 = 5
 */

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for ( int i =1;i <= 10 ;i++ ){
            System.out.println(tabuada + "x"+ i + "=" + (tabuada*i));


        }
    }
}
