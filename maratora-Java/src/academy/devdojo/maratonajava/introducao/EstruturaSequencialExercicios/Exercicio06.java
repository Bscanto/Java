package academy.devdojo.maratonajava.introducao.EstruturaSequencialExercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

ENTRADA                 SAIDA
3.0 4.0 5.0             TRIANGULO: 7.800
                        CIRCULO: 84.949
                        TRAPEZIO: 18.200
                        QUADRADO: 16.000
                        RETANGULO: 12.000
 */
public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangle, circle, trapezoid, square, rectangle;

        System.out.println("Enter value A: ");
        A = sc.nextDouble();
        System.out.println("Enter value B: ");
        B = sc.nextDouble();
        System.out.println("Enter value C: ");
        C = sc.nextDouble();

        triangle = A * C / 2.0;
        circle = 3.14159 * C * C;
        trapezoid = (A + B) / 2.0 * C;
        square = B * B;
        rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapezoid);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);

        sc.close();
    }
}
