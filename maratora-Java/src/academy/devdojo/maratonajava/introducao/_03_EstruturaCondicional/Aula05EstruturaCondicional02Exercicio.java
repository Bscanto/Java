package academy.devdojo.maratonajava.introducao._03_EstruturaCondicional;
/*
Quanto tem que pagar de salario na Holanda baseado no seguinte critério:
de 0 - 34,712 euro / taxa 9,70%
de 34,713 - 68,507 / taxa 37,35%
acima de 68,508    / taxa 49,50%
 */

import java.util.Scanner;

public class Aula05EstruturaCondicional02Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");

        int annualSalary = sc.nextInt();

        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double lastTrack = 49.50 / 100;
        double   taxAmount;

        if(annualSalary <= 34712){
            taxAmount = annualSalary * firstTrack;
        }else if(annualSalary > 34713 &&  annualSalary <= 68507){
            taxAmount = annualSalary * secondTrack;
        }else {
            taxAmount = annualSalary * lastTrack;
        }

        System.out.println("Tax Amount: " + taxAmount);
    }
}
