package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        System.out.println("Operadores Aritméticos");
        // 1️⃣ Operadores Aritméticos
        // =============================
        int a = 10;
        int b = 3;

        int soma = a + b;          // + → adição
        int subtracao = a - b;     // - → subtração
        int multiplicacao = a * b; // * → multiplicação
        int divisao = a / b;       // / → divisão inteira
        int resto = a % b;         // % → resto da divisão

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        System.out.println("=========================");
        System.out.println("Operadores de Atribuição");
        // =============================
        // 2️⃣ Operadores de Atribuição
        // =============================
        double bonus = 1800;  // bonus = 1800\

        bonus += 1000; // bonus = 2800
        System.out.println("Valor de bonus após operações de atribuição +=: " + bonus);

        bonus -= 1000; // bonus = 1800
        System.out.println("Valor de bonus após operações de atribuição -=: " + bonus);

        bonus *= 2; // bonus =  3600
        System.out.println("Valor de bonus após operações de atribuição *=: " + bonus);

        bonus /= 2; // bonus = bonus / 2
        System.out.println("Valor de bonus após operações de atribuição /=: " + bonus);

        bonus %= 3; // bonus = bonus % 3
        System.out.println("Valor de bonus após operações de atribuição %=: " + bonus);


        System.out.println("=========================");
        System.out.println("Operadores Relacionais");
        // =============================
        // 3️⃣ Operadores Relacionais
        // =============================
        int idade = 18;
        System.out.println("idade == 18? " + (idade == 18)); // == → igual
        System.out.println("idade != 18? " + (idade != 18)); // != → diferente
        System.out.println("idade > 18? " +  (idade > 18));   // > → maior que
        System.out.println("idade < 18? " +  (idade < 18));   // < → menor que
        System.out.println("idade >= 18? " + (idade >= 18)); // >= → maior ou igual
        System.out.println("idade <= 18? " + (idade <= 18)); // <= → menor ou igual

        System.out.println("=========================");
        System.out.println("Operadores Lógicos");
        // =============================
        // 4️⃣ Operadores Lógicos
        // =============================

        // =============================
        // Operador AND (&&)
        // Retorna true somente se TODAS as condições forem verdadeiras
        // =============================
        int age = 29;
        float salary = 3500F;

        boolean isMaiorQueTrinta = age >= 30 && salary >= 4612;
        boolean isMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println(isMaiorQueTrinta); // false → nenhuma condição é verdadeira
        System.out.println(isMenorQueTrinta); // true  → ambas as condições são verdadeiras


        // =============================
        // Operador OR (||)
        // Retorna true se PELO MENOS UMA condição for verdadeira
        // =============================
        int idades = 16;
        boolean temAutorizacao = true;

        boolean podeEntrar = idades >= 18 || temAutorizacao;

        System.out.println(podeEntrar); // true → uma das condições é verdadeira


        // =============================
        // Operador NOT (!)
        // Inverte o valor lógico da condição
        // =============================
        boolean estaChovendo = false;

        System.out.println(!estaChovendo); // true → false foi invertido para true


        // =============================
        // Combinação de operadores lógicos (AND + OR)
        // =============================
        int idadeMotorista = 22;
        boolean temCNH = true;

        boolean podeDirigir = (idadeMotorista >= 18 && temCNH) || idadeMotorista >= 21;

        System.out.println(podeDirigir); // true → ambas as regras permitem


        // =============================
        // Combinação de operadores lógicos (NOT + AND)
        // =============================
        boolean temDivida = false;
        boolean temNomeLimpo = !temDivida && age >= 18;

        System.out.println(temNomeLimpo); // true → não tem dívida e é maior de idade


        // =============================
        // Curto-circuito (Short-Circuit)
        // A segunda condição NÃO é avaliada se a primeira já definir o resultado
        // =============================
        int x = 10;

        if (x > 20 && x / 0 > 1) {
            System.out.println("Nunca será executado");
        }
        // Não ocorre erro porque a primeira condição é falsa


        System.out.println("=========================");
        System.out.println("Operadores Unários");

        // =============================
        // 5️⃣ Operadores Unários
        // =============================
        int contador = 0;
        contador += 1;
        contador++;
        System.out.println("contador++ = " + contador); // pós-incremento → usa depois incrementa
        ++contador;
        System.out.println("++contador = " + contador); // pré-incremento → incrementa antes de usar
        contador--;
        System.out.println("contador-- = " + contador); // pós-decremento
        --contador;
        System.out.println("--contador = " + contador); // pré-decremento\


        System.out.println("=========================");
        System.out.println("Operador Ternário");
        // =============================
        // 6️⃣ Operador Ternário
        // =============================
        int nota = 7;
        String resultado = (nota >= 6) ? "Aprovado" : "Reprovado"; // ? : → if simplificado
        System.out.println("Resultado: " + resultado);
    }
}
