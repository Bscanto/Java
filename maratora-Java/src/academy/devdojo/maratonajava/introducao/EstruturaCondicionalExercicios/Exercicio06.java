package academy.devdojo.maratonajava.introducao.EstruturaCondicionalExercicios;

import java.util.Scanner;

/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

Entrada:                  Saída:
25.01                     Intervalo (25,50]
Entrada:                  Saída:
25.00                     Intervalo [0,25]
Entrada:                  Saída:
100.00                    Intervalo (75,100]
Entrada:                  Saída:
-25.02                    Fora de intervalo
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        double number = sc.nextDouble();

        if (number >= 0 && number <= 25) {
            System.out.println("Interval [0,25]");
        }else if(number >= 25.01 && number <= 50) {
            System.out.println("Interval [25,50]");
        }else if(number >= 50.01 && number <= 75) {
            System.out.println("Interval [50,75]");
        }else if(number >= 75.01 && number <= 100) {
            System.out.println("Interval [75,100]");
        }else{
            System.out.println("Invalid number!");
        }
    }
}