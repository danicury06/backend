package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double peso;

        peso = 85.5;

        System.out.println("Qual o seu peso?");
        peso = entrada.nextDouble();

        System.out.println("Você tem " + peso + "kg");

        entrada.close();
    }
}
