package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03Break {
    public static void main(String[] args) {
        int valueMax = 50;
        for (int i = 0; i <= valueMax; i++) {
            if(i > 25) {
                break;
            }
            System.out.println("Valor de i = " + i);
        }
        System.out.println(" \n");
        System.out.println("Exercicio: Dado o valor de um carro, descubra " +
                "em quantas paercelas ele pode ser parcelado ");

        double value = 30000;
        for (int quota = 0; quota <= value ; quota++) {
            double quotaValue =  value / quota;
            if(quotaValue < 1000){
                break;
            }

            System.out.println("Quota " + quota + " $ " + quotaValue);

        }
    }
}
