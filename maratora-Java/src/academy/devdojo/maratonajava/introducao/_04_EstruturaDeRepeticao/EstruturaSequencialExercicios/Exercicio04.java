package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaSequencialExercicios;

import java.util.Scanner;

/*

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

Entrada:                 Saída:
25                       NUMBER = 25
100                      SALARY = U$ 550.00
5.50


 */
public class Exercicio04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int hours;
        double ratehours;

        System.out.println("Enter the employee number: ");
        number = sc.nextInt();
        System.out.println("Enter the employee's hours:");
        hours = sc.nextInt();
        System.out.println("Enter your hourly rate:");
        ratehours = sc.nextInt();

        double salary = hours * ratehours;

        System.out.println("employee number: " + number);
        System.out.printf("SALARY = U$ %.2f", salary);

        sc.close();
    }
}