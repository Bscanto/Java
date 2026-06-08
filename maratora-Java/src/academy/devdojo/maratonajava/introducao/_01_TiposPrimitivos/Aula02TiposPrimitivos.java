package academy.devdojo.maratonajava.introducao._01_TiposPrimitivos;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //Tiposs Primitivos são tipos que vão guardar em memória um valor simples
        // int, double, float, char, byte, short, long, boolean.

        byte idadeByte = 10;         // byte    → 1 byte → armazena números inteiros pequenos (-128 a 127)
        short idadeShord = 10;       // short   → 2 bytes → armazena números inteiros médios (-32.768 a 32.767)
        char caractere = 'M';        // char    → 2 bytes → armazena um único caractere Unicode (0 a 65.535)
        int age = 18;                // int     → 4 bytes → armazena números inteiros (-2.147.483.648 a 2.147.483.647)
        long numeroGrande = 100000;  // long    → 8 bytes → armazena números inteiros maiores (-9 quintilhões a +9 quintilhões)
        double salarioDouble = 2000; // double  → 8 bytes → armazena números decimais com maior precisão (ponto flutuante)
        float salarioFloat = 2500.0F;   // float   → 4 bytes → armazena números decimais com menor precisão que double
        boolean verdadeiro = true;   // boolean → (geralmente 1 byte) → armazena true ou false
        boolean falso = false;       // boolean → (geralmente 1 byte) → armazena true ou false

        String nome = "Bruno";

        System.out.println("Meu nome é " + nome);


        var idade = 25;

        System.out.printf("Nome: %s | Idade: %d%n",nome,idade);
    }
}
