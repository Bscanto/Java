package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        System.out.println("WHILE \n");
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        System.out.println("\n DO - WHILE \n");
        int count=0;

        do {
            System.out.println("Contador: "+count);
            count++;
        }while (count < 5);

        int opcao;

        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Sair");
            opcao=3;// simulação
        }while (opcao!=3);


        System.out.println("\n FOR \n ");

        for (int i=0; i < 5; i++) {
            System.out.println("i = "+i);
        }

    }
}
