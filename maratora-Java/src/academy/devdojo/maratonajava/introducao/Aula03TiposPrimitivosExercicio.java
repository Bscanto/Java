package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 Prática

 Crie variaveis para os campos descritos  abaixo entre < >  e imprima a seguinte mensagem:

 Eu <nome> mmorando noendereço  <endereço>
 confirmo que recebi o salário <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your salary: ");
        double pay = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.print("Enter the date (e.g., 02/13/2026): ");
        String date = sc.nextLine();

        System.out.println("\nI, " + name + ", living at " + address +
                ", confirm that I received the salary of " + pay +
                " on " + date + ".");

    }

}
