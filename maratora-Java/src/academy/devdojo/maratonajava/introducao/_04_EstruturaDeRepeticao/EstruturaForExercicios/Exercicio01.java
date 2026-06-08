package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaForExercicios;

import java.util.Scanner;

/*
Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso.

Entrada:        Saída:
8               1
                3
                5
                7

 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int X = sc.nextInt();

        for (int i = 0; i <= X; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}
