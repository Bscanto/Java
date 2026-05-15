package academy.devdojo.maratonajava.introducao;
/**
 Estrutura	Quando usar
 if	                    Quando há apenas uma condição
 if/else	            Quando há duas possibilidades
 if/else if/else	    Quando há várias condições
 switch	                Quando há várias opções fixas (menus, dias, meses, etc.)
 ? : (ternário)	        Quando quiser um if/else simples em uma linha
 */

public class Aula05EstruturaCondicional01 {
    public static void main(String[] args) {

        System.out.println("IF (se) - Executa um bloco se a condição for verdadeira");
        // =====================================
        // 1️⃣ IF (se)
        // Executa um bloco se a condição for verdadeira
        // =====================================
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }


        System.out.println("IF - ELSE - Executa um bloco se for verdadeiro Caso contrário, executa outro bloco");
        // =====================================
        // 2️⃣ IF - ELSE
        // Executa um bloco se for verdadeiro
        // Caso contrário, executa outro bloco
        // =====================================
        if (idade >= 18) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

        System.out.println("IF - ELSE IF - ELSE - Usado para múltiplas condições");
        // =====================================
        // 3️⃣ IF - ELSE IF - ELSE
        // Usado para múltiplas condições
        // =====================================

        int nota = 7;

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }


        int idadeJogador =14;
        String categoria;

        if(idadeJogador < 15){
            categoria = "Categoria Infantil";
        }else if (idadeJogador >= 15 && idadeJogador < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);


        System.out.println("SWITCH - Usado quando temos várias opções fixas");
        // =====================================
        // 4️⃣ SWITCH
        // Usado quando temos várias opções fixas
        // =====================================
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // =====================================
        // 5️⃣ Operador Ternário
        // Forma reduzida de if/else
        // =====================================
        String resultado = (nota >= 6) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);


    }
}
