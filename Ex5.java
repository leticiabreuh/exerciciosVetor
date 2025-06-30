/*5. Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, 
calcule e imprima a média geral.*/

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] prova = new int[15];
        int soma = 0;
        double mediaGeral;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            prova[i] = scanner.nextInt();
            soma += prova[i]; // Acumula as notas
        }

        mediaGeral = soma / 15.0; 
        System.out.println("A media geral da sala e: " + mediaGeral);

        scanner.close();
    }
}
