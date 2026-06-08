package academy.devdojo.maratonajava.introducao._03_EstruturaCondicional.EstruturaCondicionalExercicios;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

Entrada:            Saída:
6 24                Sao Multiplos
Entrada:            Saída:
6 25                Nao sao Multiplos
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number A: ");
        int A = sc.nextInt();
        System.out.println("Enter number B: ");
        int B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("There are multiples.");
        }else{
            System.out.println("There are no multiples.");
        }
    }
}
