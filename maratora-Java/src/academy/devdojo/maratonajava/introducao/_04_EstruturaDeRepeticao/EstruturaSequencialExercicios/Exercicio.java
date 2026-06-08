package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaSequencialExercicios;

import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler as medidas da largura e comprimento de um terreno
    retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
    com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
    terreno, bem como o valor do preç do terreno, ambos com duas casas decimais,
    conforme o exemplo.

    Entrada:                        Saida:
    10.0                            AREA = 300.00
    30.0                            Preco = 60000.00
    200.00
     */
public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double width;
        double length;
        double value;

        System.out.println("Enter the Width: ");
        width = sc.nextDouble();
        System.out.println("Enter the Length: ");
        length = sc.nextDouble();
        System.out.println("Enter the price per square meter: ");
        value = sc.nextDouble();

        double Area;
        Area = width * length;
        double price = Area * value;
        System.out.printf("Area = %.2f%n", Area);
        System.out.printf("Price = %.2f ", price);

        sc.close();
    }
}
