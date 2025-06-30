/*4. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos na ordem inversa.*/

public class Ex4 {
    public static void main(String[] args) {
        int[] numeros = new int[6];

        // Gerar os números aleatórios e armazenar no vetor
        for (int i = 0; i < 6; i++) {
            numeros[i] = (int) (Math.random() * 101);          
        }

        // Exibir os números na ordem inversa
        System.out.println("Numeros em ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println("Numero: " + numeros[i]);
        }
    }
}
