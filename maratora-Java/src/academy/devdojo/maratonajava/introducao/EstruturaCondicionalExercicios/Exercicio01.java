package academy.devdojo.maratonajava.introducao.EstruturaCondicionalExercicios;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro,
e depois dizer se este número é negativo ou não

Entrada:        Saída:
-10             NEGATIVO
Entrada:        Saída:
8               NAO NEGATIVO
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if(number >= 0 ){
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }
}
