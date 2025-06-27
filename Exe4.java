/*4. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos na ordem inversa.*/

import java.util.Scanner;

public class Exe4{

    public static void main(String[] args){
        int[] numeros = new int [6];

        for(int i = 0; i < 6; i++){
            numeros[i] = (int) (Math.random() *101);          
        }

            System.out.println("Numeros em ordem inversa: ");
            for (int i = 5; i >= 0; i--){
                numeros[i] = (int) (Math.random() *101);
                System.out.println("Numeros: "+numeros[i]);
            }

    }
}

