package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao.EstruturaForExercicios;

import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo,
e "out" para fora do intervalo).

Entrada:         Saída:
5                2 in
14               3 out
123
10
-25
32

 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            }else {
            out++;
            }
        }
        System.out.println(in +" in " + " \n" + out + " out");

        sc.close();
    }
}
