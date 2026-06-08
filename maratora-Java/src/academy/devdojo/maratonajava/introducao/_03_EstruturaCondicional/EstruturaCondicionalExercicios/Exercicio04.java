package academy.devdojo.maratonajava.introducao._03_EstruturaCondicional.EstruturaCondicionalExercicios;

import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

 Entrada:           Saída:
16 2                O JOGO DUROU 10 HORA(S)
Entrada:            Saída:
0 0                 O JOGO DUROU 24 HORA(S)
Entrada:            Saída:
2 16                O JOGO DUROU 14 HORA(S)
 */
public class Exercicio04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Start Time: ");
    int startTime =  sc.nextInt();

    System.out.println("Enter End Time: ");
    int endTime = sc.nextInt();

    int duration;
    if(startTime < endTime){
        duration = endTime - startTime;
    }else {
        duration = 24 -  startTime + endTime ;
    }
        System.out.println("O JOGO DUROU " + duration + " HORA(S)");

        sc.close();
    }
}
