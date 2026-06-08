package academy.devdojo.maratonajava.introducao._00_EntradaSaidaDados;

import java.util.Scanner;

public class Aula00EntradaESaidaDados {

    public static void main(String[] args) {
        // Cria o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Entrada de Strin
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Entrada de char
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        // Entrada de byte
        System.out.print("Digite um valor byte: ");
        byte b = scanner.nextByte();

        // Entrada de short
        System.out.print("Digite um valor short: ");
        short s = scanner.nextShort();

        // Entrada de int
        System.out.print("Digite um valor int: ");
        int i = scanner.nextInt();

        // Entrada de long
        System.out.print("Digite um valor long: ");
        long l = scanner.nextLong();

        // Entrada de float
        System.out.print("Digite um valor float: ");
        float f = scanner.nextFloat();

        // Entrada de double
        System.out.print("Digite um valor double: ");
        double d = scanner.nextDouble();

        // Entrada de boolean
        System.out.print("Digite true ou false: ");
        boolean bool = scanner.nextBoolean();

        // Saída usando println
        System.out.println("\n===== DADOS INFORMADOS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Letra: " + letra);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + bool);

        // Saída usando printf
        System.out.println("\n===== SAÍDA FORMATADA =====");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Letra: %c%n", letra);
        System.out.printf("Byte: %d%n", b);
        System.out.printf("Short: %d%n", s);
        System.out.printf("Int: %d%n", i);
        System.out.printf("Long: %d%n", l);
        System.out.printf("Float: %.2f%n", f);
        System.out.printf("Double: %.2f%n", d);
        System.out.printf("Boolean: %b%n", bool);

        // Saída usando print
        System.out.print("\nObrigado por utilizar o programa!");

        // Fecha o Scanner
        scanner.close();
    }
}