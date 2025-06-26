/*1. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos.*/

import java.util.Scanner;

public class Ex1{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       // System.out.println(valores.length);
    
        int[] valores = new int [6];
        System.out.println("Tamanho do vetor: "+valores.length);


        
        for( int i = 0; i < 6; i++){
            System.out.println("Digite um valor: ");
            valores[i] = scanner.nextInt();
        }
        //Mostra os valores digitados
        for(int i = 0; i < valores.length ; i++){
             System.out.println(valores[i]);


        }


    }
}