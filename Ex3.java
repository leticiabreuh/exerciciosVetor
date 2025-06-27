/*3. Faça um programa que receba do usuário um vetor com 10 posições. Em seguida 
deverá ser impresso o maior e o menor elemento do vetor.*/

import java.util.Scanner;

public class Ex3{

    public static void main(String[] args) {
        int [] numeros = new int [10];
        int maior, menor;


        //Scanner scanner = new Scaner(System.in);

        for(int i = 0; i < 10; i++){

            numeros[i] = (int) (Math.random() *101);

            System.out.println( numeros[i]);
        }

        maior = numeros[0];
        menor = numeros[0];

        for(int i = 1; i < 10; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            } if(numeros[i]< menor){
                menor = numeros[i];
            }

        }

            System.out.println("Maior: "+maior);
            System.out.println("menor: "+ menor);

 
    }

}