package academy.devdojo.maratonajava.introducao._05_Arrays;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idade = new int[3];
        idade[0] = 19;
        idade[1] = 27;
        idade[2] = 39;
        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);
        System.out.println("\n");

        String[] nomes = new String[4];
        nomes[0] = "Naruto";
        nomes[1] = "Sakura";
        nomes[2] = "Susuke";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println(" ");
        // 1️Declaração e inicialização de um array de inteiros
        // O array abaixo armazena 5 números inteiros
        int[] numeros = {10, 20, 30, 40, 50};

        // 2️Exibindo o tamanho do array
        // length retorna a quantidade de posições do array
        System.out.println("Tamanho do array: " + numeros.length);

        System.out.println("---------------------------");

        // 3️Acessando elementos do array pelo índice
        // Índices começam em 0
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);

        System.out.println("---------------------------");

        // 4️Percorrendo o array com for tradicional
        System.out.println("Percorrendo com for tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        System.out.println("---------------------------");

        // 5️Percorrendo o array com for-each
        // Usado quando não precisamos do índice
        System.out.println("Percorrendo com for-each:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("---------------------------");

        // 6️Alterando um valor do array
        // Substituindo o valor da posição 2 (30) por 99
        numeros[2] = 99;

        System.out.println("Array após alteração:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("---------------------------");

        // 7️Somando todos os valores do array
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("Soma dos valores: " + soma);

        System.out.println("---------------------------");

        // 8️ Calculando a média dos valores
        double media = (double) soma / numeros.length;
        System.out.println("Média dos valores: " + media);

        System.out.println("---------------------------");

        // 9️Verificando números maiores que 25
        System.out.println("Números maiores que 25:");
        for (int numero : numeros) {
            if (numero > 25) {
                System.out.println(numero);
            }
        }


    }
}
