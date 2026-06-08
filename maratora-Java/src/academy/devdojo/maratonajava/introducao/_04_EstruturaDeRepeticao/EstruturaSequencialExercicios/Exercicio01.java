package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaSequencialExercicios;



/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

Entrada:            Saída:
10                  SOMA = 40
30

*/

import java.util.Scanner;

public class Exercicio01 {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum = " + sum);


    }
}
