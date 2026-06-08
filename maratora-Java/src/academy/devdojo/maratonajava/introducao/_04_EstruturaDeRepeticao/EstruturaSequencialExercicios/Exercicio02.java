package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaSequencialExercicios;

import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio 2
Considere o valor de π = 3.14159
Entrada:            Saída:
2.00                A=12.5664

 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;

        System.out.println("Enter the circle radius: ");
        radius = sc.nextDouble();

        double areaCircle = 3.14159 * (radius * radius);

        System.out.printf("Area = %.4f",areaCircle);

    }
}
