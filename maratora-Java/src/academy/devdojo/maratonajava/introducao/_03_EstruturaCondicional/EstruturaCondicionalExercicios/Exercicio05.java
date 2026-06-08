package academy.devdojo.maratonajava.introducao._03_EstruturaCondicional.EstruturaCondicionalExercicios;

import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.


Codigo      Especificacao       Preco
1           cachorro-quente     R$4.00
2           X-salada            R$4.50
3           X-Bacon             R$5.00
4           Torrada             R$2.00
5           Refrigerante        R$1.50


Entrada:        Saída:
3 2             Total: R$ 10.00
Entrada:        Saída:
2 3             Total: R$ 13.50
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo\tEspecificacao\tPreco");
        System.out.println("1\tcachorro-quente\tR$4.00");
        System.out.println("2\tX-salada\tR$4.50");
        System.out.println("3\tX-Bacon\tR$5.00");
        System.out.println("4\tTorrada\tR$2.00");
        System.out.println("5\tRefrigerante\tR$1.50");

        System.out.println("Enter the product code: ");
        int product = sc.nextInt();
        System.out.println("Enter the quantity of the product: ");
        int quantity = sc.nextInt();

        double total;

        if (product == 1) {
            total = quantity * 4.00;
        }else if (product == 2) {
            total = quantity * 4.50;
        }else if (product == 3) {
            total = quantity * 5.00;
        }else if (product == 4) {
            total = quantity * 2.00;
        }else if (product == 5) {
            total = quantity * 1.50;
        } else {
            System.out.println("Invalid product code!");
            return;
        }

        System.out.printf("Total to pay: R$ %.2f%n", total);
    }
}
