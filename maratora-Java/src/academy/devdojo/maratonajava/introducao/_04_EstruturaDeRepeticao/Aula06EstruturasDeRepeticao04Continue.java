package academy.devdojo.maratonajava.introducao._04_EstruturaDeRepeticao;

public class Aula06EstruturasDeRepeticao04Continue {
    public static void main(String[] args) {
        double value = 30000;
        for (int quota = (int) value; quota >= 1; quota--) {
            double quotaValue =  value / quota;
            if(quotaValue < 1000){
                continue;
            }

            System.out.println("Quota " + quota + " $ " + quotaValue);

        }
    }
}
