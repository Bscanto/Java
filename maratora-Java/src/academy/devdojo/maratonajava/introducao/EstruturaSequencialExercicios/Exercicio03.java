package academy.devdojo.maratonajava.introducao.EstruturaSequencialExercicios;

import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).

Entrada:                 Saída:
5                        DIFERENCA = -26
6
7
8

 */
public class Exercicio03 {
  public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Enter integer value A: ");
        A = sc.nextInt();
        System.out.println("Enter integer value B: ");
        B = sc.nextInt();
        System.out.println("Enter integer value C: ");
        C = sc.nextInt();
        System.out.println("Enter integer value D: ");
        D = sc.nextInt();


        int difference = (A * B - C * D);

        System.out.println("The difference in the product is:" + difference);
    }
}
