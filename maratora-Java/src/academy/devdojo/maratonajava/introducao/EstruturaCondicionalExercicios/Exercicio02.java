package academy.devdojo.maratonajava.introducao.EstruturaCondicionalExercicios;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

Entrada:         Saída:
12               PAR
Entrada:         Saída:
-27              IMPAR
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Even number.");
        }else{
            System.out.println("Odd number.");
        }
    }
}
