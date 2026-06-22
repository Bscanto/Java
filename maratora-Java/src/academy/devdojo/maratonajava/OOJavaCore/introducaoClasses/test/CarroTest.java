package academy.devdojo.maratonajava.OOJavaCore.introducaoClasses.test;

import academy.devdojo.maratonajava.OOJavaCore.introducaoClasses.model.Carro;

public class CarroTest {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Camaro";
        carro1.modelo = "SS";
        carro1.ano = 1961 ;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1969 ;

        carro1=carro2;
        System.out.println(carro1.nome + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.ano);

        System.out.println(carro2);
    }
}
