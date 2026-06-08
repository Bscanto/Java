package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaForExercicios;

import java.util.Scanner;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e
mostre a divisão do primeiro pelo segundo. Se o denominador
for igual a zero, mostrar a mensagem "divisao impossivel".

Entrada:            Saída:
3                   -1.5
3 -2                divisao impossivel
-8 0                0.0
0 8
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite com a quantidades: ");
        double N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Entre com numero");
            double a = sc.nextDouble();
            System.out.println("Entre com outro numero");
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) a / b;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
