package academy.devdojo.maratonajava.OOJavaCore.introducaoClasses.test;

import academy.devdojo.maratonajava.OOJavaCore.introducaoClasses.model.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Mestre Kami ";
        professor.sexo = 'M';
        professor.matricula = 172026;
        professor.idade = 42;

        System.out.println("Nome: " + professor.nome
                + " matricula: " + professor.matricula
                + " idade: " + professor.idade
                + " sexo: " + professor.sexo);
    }
}
