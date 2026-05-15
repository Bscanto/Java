package academy.devdojo.maratonajava.introducao.EstruturaSequencialExercicios;

import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
Exemplos:

Entrada:            Saída:
12 1 5.30           VALOR A PAGAR: R$ 15.50
16 2 5.10

 */
public class Exercicio05 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, amount1, amount2;
        double value1, value2, total;

        System.out.println("Enter code 1: ");
        cod1 = sc.nextInt();
        System.out.println("Enter amount1: ");
        amount1 = sc.nextInt();
        System.out.println("Enter value1");
        value1 = sc.nextDouble();

        System.out.println("Enter code 2: ");
        cod2 = sc.nextInt();
        System.out.println("Enter amount2: ");
        amount2 = sc.nextInt();
        System.out.println("Enter value2: ");
        value2 = sc.nextDouble();

        total = amount1 * value1 + amount2 * value2;

        System.out.printf("Amount to pay: R$ %.2f%n", total);

    }
}

