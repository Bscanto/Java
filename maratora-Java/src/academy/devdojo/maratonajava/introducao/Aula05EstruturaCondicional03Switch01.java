package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturaCondicional03Switch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        var option  = sc.nextInt();

       var message =  switch (option) {
            case 1 -> "Hoje é Domingo";
            case 2 -> "Hoje é Segunda";
            case 3 -> "Hoje é Treça";
            case 4 -> "Hoje é Quarta";
            case 5 -> "Hoje é Quinta";
            case 6 -> "Hoje é Sexta";
            case 7 -> "Hoje é Sabado";
            default -> "Dia Invalida";
        };
        System.out.println(message);
    }
}
