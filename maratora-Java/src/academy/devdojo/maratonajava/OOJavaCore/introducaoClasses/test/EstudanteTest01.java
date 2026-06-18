package academy.devdojo.maratonajava.OOJavaCore.introducaoClasses.test;

import academy.devdojo.maratonajava.OOJavaCore.introducaoClasses.model.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        Estudante Estudante = new Estudante();
        Estudante.nome = "Bruno";
        Estudante.sexo = 'M';
        Estudante.idade = 20;

        System.out.println(Estudante.nome);
        System.out.println(Estudante.idade);
        System.out.println(Estudante.sexo);

        System.out.println(Estudante);// <- acessa o endereço de memoria
    }

}
