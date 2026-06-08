package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao;

public class Aula06EstruturasDeRepeticao02Exercicios {
    public static void main(String[] args)  {

        System.out.println("\nImprima os números de 1 a 100 com while:\n");
        int num = 0;

        while(num <= 100){
            System.out.println("número: " + num);
            num++;
        }

        System.out.println("\nImprima os números de 1 a 100 com for:\n");

        for (int i = 0; i <= 100 ; i++) {
            System.out.println("i = :" + i);
        }

        System.out.println("\n Imprima apenas os números pares de 1 a 50. \n");

        for (int numPar = 0; numPar <= 50; numPar++) {
            if(numPar % 2 == 0) {
                System.out.println("números pares: " + numPar);
                numPar++;
            }

        }


        System.out.println("\n Simule um menu com do...while até o usuário escolher sair.\n");

        int opcao = 0;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (opcao == 1) {
                System.out.println("Você escolheu a opção 1");
            } else if (opcao == 2) {
                System.out.println("Você escolheu a opção 2");
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }

            System.out.println();

        } while (opcao != 0);


        System.out.println("Use break para parar o loop quando o número for múltiplo de 7.\n ");

        for (int i = 9; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Múltiplo de 7 encontrado: " + i);
                break; // interrompe o loop
            }
            System.out.println("Número: " + i);
        }
    }
}


