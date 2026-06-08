package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaForExercicios;


/*
Ler um valor N. Calcular e escrever seu respectivo fatorial.
 Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

Entrada:            Saída:
4                   24

1                   1

5                   120

0                   1
 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=numero; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}