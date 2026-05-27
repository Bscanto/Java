package academy.devdojo.maratonajava.introducao.EstruturaForExercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores,
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro
valor tem peso 5.

Entrada:            Saída:
3                   5.7
6.5 4.3 6.2         6.3
5.1 4.2 8.1         9.3
8.0 9.0 10.0
 */
public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println("Digite o valor de a: ");
            double a = sc.nextDouble();
            System.out.println("Digite o valor de b: ");
            double b = sc.nextDouble();
            System.out.println("Digite o valor de c: ");
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("A média é: %.1f%n", media);
        }

        sc.close();
    }
}
