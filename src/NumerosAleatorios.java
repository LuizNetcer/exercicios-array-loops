import java.util.Random;

/* programa que leia 20 numeros inteiros aleatorios (entre 0 e 100)
armazee-os num vetor e ao final mostr os numeros e seus sucessores

 */
public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("numeros aleatorios ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }
        System.out.println("\nsucessores dos numeros aleatorios ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");

        }
    }
}
