# ☕ Java Completo — Do Zero ao Avançado

> Guia definitivo de estudos em Java  
> Estrutura organizada para aprendizado progressivo  
> Com teoria, exemplos, exercícios e projetos

---

# 📚 Sumário

- [1 - Introdução](#1---introdução)
- [2 - Configuração do Ambiente](#2---configuração-do-ambiente)
- [3 - Sintaxe Básica](#3---sintaxe-básica)
- [4 - Variáveis e Tipos](#4---variáveis-e-tipos)
- [5 - Operadores](#5---operadores)
- [6 - Estruturas Condicionais](#6---estruturas-condicionais)
- [7 - Estruturas de Repetição](#7---estruturas-de-repetição)
- [8 - Métodos](#8---métodos)
- [9 - Arrays](#9---arrays)
- [10 - Programação Orientada a Objetos](#10---programação-orientada-a-objetos)
- [11 - Encapsulamento](#11---encapsulamento)
- [12 - Herança](#12---herança)
- [13 - Polimorfismo](#13---polimorfismo)
- [14 - Interfaces](#14---interfaces)
- [15 - Exceções](#15---exceções)
- [16 - Collections](#16---collections)
- [17 - Streams e Lambda](#17---streams-e-lambda)
- [18 - Manipulação de Arquivos](#18---manipulação-de-arquivos)
- [19 - JDBC](#19---jdbc)
- [20 - Exercícios Resolvidos](#20---exercícios-resolvidos)
- [21 - Desafios](#21---desafios)
- [22 - Projetos Guiados](#22---projetos-guiados)
- [23 - Roadmap de Evolução](#23---roadmap-de-evolução)

---

# 1 - Introdução

Java é:

- Orientada a Objetos
- Fortemente tipada
- Multiplataforma (JVM)
- Muito usada em backend e sistemas empresariais

Filosofia:

> Write Once, Run Anywhere

---

# 2 - Configuração do Ambiente

Instalar JDK

Verificar:

```bash
java -version
javac -version
```

IDEs recomendadas:

- IntelliJ
- Eclipse
- VS Code

---

# 3 - Sintaxe Básica

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
    }
}
```

---

# 4 - Variáveis e Tipos

## Primitivos

| Tipo    | Tamanho | Intervalo / Descrição                                  |
| ------- | ------- | ------------------------------------------------------ |
| byte    | 1 byte  | -128 a 127                                             |
| short   | 2 bytes | -32.768 a 32.767                                       |
| int     | 4 bytes | -2.147.483.648 a 2.147.483.647                         |
| long    | 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |
| float   | 4 bytes | Ponto flutuante (menor precisão)                       |
| double  | 8 bytes | Ponto flutuante (maior precisão)                       |
| char    | 2 bytes | Caractere Unicode (0 a 65.535)                         |
| boolean | ~1 byte | true ou false                                          |

```java
public class TiposPrimitivos {
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

    }
}

```

## String

# 📌 Strings em Java

## 📖 O que é String?

Em Java, `String` representa uma **sequência de caracteres**.  
É muito utilizada para armazenar nomes, textos, mensagens e qualquer dado textual.

Exemplo básico:

```java
String nome = "Bruno";
System.out.println("Meu nome é " + nome);
```

---

## 💻 Criando Strings

Existem duas formas comuns de criar Strings:

```java
String nome1 = "Bruno";                 // Literal
String nome2 = new String("Bruno");     // Usando construtor
```

- A primeira forma é mais usada.
- Java otimiza Strings literais usando o **String Pool** (uma área especial de memória para Strings).

---

## 🔎 Métodos Importantes de String

```java
String texto = "  Java é incrível  ";

texto.length();        // Retorna o tamanho da String (contando espaços)
texto.toUpperCase();   // Converte para maiúsculas → "  JAVA É INCRÍVEL  "
texto.toLowerCase();   // Converte para minúsculas → "  java é incrível  "
texto.trim();          // Remove espaços no início e no fim → "Java é incrível"
texto.contains("Java");// Verifica se contém "Java" → true
texto.equals("Java");  // Compara conteúdo → true/false
texto.charAt(0);       // Retorna caractere no índice 0 → 'J'
texto.replace("Java", "Python"); // Substitui conteúdo
texto.split(" ");      // Divide em array de Strings
```

---

## 🏗 Imutabilidade

Strings são **imutáveis**, ou seja, não podem ser alteradas depois de criadas.

Exemplo:

```java
String nome = "Bruno";
nome = nome + " Silva"; // Cria um novo objeto na memória
```

- A String original `"Bruno"` permanece inalterada.
- O operador `+` cria uma nova String.

---

## 💾 String Pool

Java mantém uma área especial na memória chamada **String Pool**.

Se duas Strings literais têm o mesmo valor, elas **podem compartilhar o mesmo objeto**:

```java
String a = "Java";
String b = "Java";

System.out.println(a == b); // true → mesmas referências
```

Isso economiza memória.

---

## ⚠ Comparação de Strings

Nunca use `==` para comparar conteúdo de Strings:

```java
String a = "Java";
String b = new String("Java");

System.out.println(a == b);      // false → referências diferentes
System.out.println(a.equals(b)); // true  → conteúdo igual
```

✅ Sempre use `.equals()` para comparar conteúdo textual.

---

## 🔧 Concatenando Strings

### 1️⃣ Usando `+`

```java
String nome = "Bruno";
String sobrenome = "Silva";

System.out.println(nome + " " + sobrenome);
```

### 2️⃣ Usando `String.format()`

```java
int idade = 25;
String texto = String.format("Nome: %s, Idade: %d", nome, idade);
System.out.println(texto);
```

### 3️⃣ Usando `StringBuilder` (eficiente em loops)

```java
StringBuilder sb = new StringBuilder();
sb.append("Meu nome é ");
sb.append("Bruno");
System.out.println(sb.toString());
```

---

## 🧠 Resumo

- `String` é **uma classe** e **um objeto**.
- Imutável: alterações criam novos objetos.
- Pode usar métodos poderosos como `.length()`, `.toUpperCase()`, `.trim()`.
- Comparação de conteúdo sempre com `.equals()`.
- Para concatenações grandes, use `StringBuilder`.

---

---

# 5 - Operadores

---

Operadores são símbolos que realizam operações sobre variáveis e valores.

---

# 1️⃣ Operadores Aritméticos

Usados para realizar cálculos matemáticos.

| Operador | Descrição        |
| -------- | ---------------- |
| +        | Adição           |
| -        | Subtração        |
| \*       | Multiplicação    |
| /        | Divisão          |
| %        | Resto da divisão |

```java
int a = 10;
int b = 3;

int soma = a + b;
int subtracao = a - b;
int multiplicacao = a * b;
int divisao = a / b;
int resto = a % b;

System.out.println("Soma: " + soma);
System.out.println("Subtração: " + subtracao);
System.out.println("Multiplicação: " + multiplicacao);
System.out.println("Divisão: " + divisao);
System.out.println("Resto: " + resto);
```

⚠ **Atenção:**  
Se ambos os números forem `int`, a divisão será inteira (descarta a parte decimal).

---

# 2️⃣ Operadores de Atribuição

Servem para atribuir e atualizar valores.

| Operador | Equivalente        |
| -------- | ------------------ |
| =        | Atribuição simples |
| +=       | x = x + valor      |
| -=       | x = x - valor      |
| \*=      | x = x \* valor     |
| /=       | x = x / valor      |
| %=       | x = x % valor      |

```java
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

```

---

# 3️⃣ Operadores Relacionais

Comparam valores e retornam `true` ou `false`.

| Operador | Significado    |
| -------- | -------------- |
| ==       | Igual          |
| !=       | Diferente      |
| >        | Maior que      |
| <        | Menor que      |
| >=       | Maior ou igual |
| <=       | Menor ou igual |

```java
int idade = 18;
        System.out.println("idade == 18? " + (idade == 18)); // == → igual
        System.out.println("idade != 18? " + (idade != 18)); // != → diferente
        System.out.println("idade > 18? " +  (idade > 18));   // > → maior que
        System.out.println("idade < 18? " +  (idade < 18));   // < → menor que
        System.out.println("idade >= 18? " + (idade >= 18)); // >= → maior ou igual
        System.out.println("idade <= 18? " + (idade <= 18)); // <= → menor ou igual

```

---

# 4️⃣ Operadores Lógicos

Usados para combinar expressões booleanas.

| Operador | Significado |
| -------- | ----------- |
| &&       | E lógico    |
| \|\|     | OU lógico   |
| !        | Negação     |

```java
int age = 29;
float salary = 3500F;

boolean maiorQueTrinta = age >= 30 && salary >= 4612;
boolean menorQueTrinta = age < 30 && salary >= 3381;

System.out.println(maiorQueTrinta);
System.out.println(menorQueTrinta);
```

---

# 5️⃣ Operadores Unários

Atuam sobre um único operando.

| Operador | Função     |
| -------- | ---------- |
| ++       | Incremento |
| --       | Decremento |
| !        | Negação    |

```java
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

```

📌 Diferença:

- `contador++` → usa o valor primeiro, depois incrementa.
- `++contador` → incrementa primeiro, depois usa o valor.

---

# 6️⃣ Operador Ternário

Forma simplificada do `if/else`.

Sintaxe:

```java
condicao ? valorSeVerdadeiro : valorSeFalso;
```

Exemplo:

```java
int nota = 7;

String resultado = (nota >= 6) ? "Aprovado" : "Reprovado";

System.out.println(resultado);
```

---

# 🧠 Resumo Geral

- Aritméticos → cálculos
- Atribuição → atualizar valores
- Relacionais → comparação
- Lógicos → combinar condições
- Unários → incremento/decremento
- Ternário → if simplificado

---

---

# 6 - Estruturas Condicionais

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

---

# 7 - Estruturas de Repetição

## For

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

## While

```java
while (x < 10) {
    x++;
}
```

---

# 8 - Métodos

```java
public static int somar(int a, int b) {
    return a + b;
}
```

---

# 9 - Arrays

```java
int[] numeros = {1, 2, 3};

for (int n : numeros) {
    System.out.println(n);
}
```

---

# 10 - Programação Orientada a Objetos

## Classe

```java
public class Pessoa {
    String nome;
    int idade;
}
```

## Objeto

```java
Pessoa p = new Pessoa();
p.nome = "Carlos";
```

---

# 11 - Encapsulamento

```java
public class Conta {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
```

---

# 12 - Herança

```java
class Animal {
    void som() {
        System.out.println("Som");
    }
}

class Cachorro extends Animal {
    void som() {
        System.out.println("Au Au");
    }
}
```

---

# 13 - Polimorfismo

```java
Animal a = new Cachorro();
a.som();
```

---

# 14 - Interfaces

```java
interface Pagamento {
    void pagar(double valor);
}
```

---

# 15 - Exceções

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro!");
}
```

---

# 16 - Collections

```java
List<String> nomes = new ArrayList<>();
Set<Integer> numeros = new HashSet<>();
Map<String, Integer> mapa = new HashMap<>();
```

---

# 17 - Streams e Lambda

```java
lista.stream()
     .filter(n -> n % 2 == 0)
     .forEach(System.out::println);
```

---

# 18 - Manipulação de Arquivos

```java
FileWriter writer = new FileWriter("arquivo.txt");
writer.write("Texto");
writer.close();
```

---

# 19 - JDBC

```java
Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/meubanco",
    "usuario",
    "senha"
);
```

---

# 20 - Exercícios Resolvidos

## 1 - Trocar valores

```java
int a = 10;
int b = 20;

int temp = a;
a = b;
b = temp;
```

---

# 21 - Desafios

### Desafio 1

Crie uma calculadora usando switch.

### Desafio 2

Crie uma classe ContaBancaria com:

- Depositar
- Sacar
- Ver saldo

### Desafio 3

Criar sistema de cadastro com ArrayList.

---
