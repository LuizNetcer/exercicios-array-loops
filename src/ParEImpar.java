import java.util.Scanner;

/* faca um programa que peça n numeros inteiros
calcule e mostre a quantidae de numeros pares
e a quanridade de numeros impares
 */
public class ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade d enumeros: ");
        quantNumeros= scan.nextInt();

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero % 2 ==0) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("quantidade par: " + quantPares);
        System.out.println("quantidade impares: " + quantImpares);
    }

}
